package com.example.buoi_03;

import android.os.Bundle;
import android.os.PowerManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.MergeAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvcData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rvcData = findViewById(R.id.rcv_product);

        ProductAdapter productAdapter = new ProductAdapter(createProducts());
        SupportAdapter supportAdapter = new SupportAdapter(createSupport());

        MergeAdapter adapter = new MergeAdapter(productAdapter, supportAdapter);
        rvcData.setLayoutManager(new LinearLayoutManager(this));
        rvcData.setAdapter(adapter);
    }

    private List<Product> createProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Hũ Vàng", 100000));
        products.add(new Product("Chứng Khoán", 200000));
        products.add(new Product("Đầu tư quỹ", 200000));
        products.add(new Product("Tích lũy", 200000));
        products.add(new Product("Ngân hàng", 200000));
        return products;
    }

    private List<Support> createSupport(){
        List<Support> supports = new ArrayList<>();
        supports.add(new Support("Hướng dẫn người mới 1"));
        supports.add(new Support("Hướng dẫn người mới 2"));
        supports.add(new Support("Hướng dẫn người mới 3"));
        supports.add(new Support("Hướng dẫn người mới 4"));
        return supports;
    }
}