package com.febriputratrisbudiono.recyclelistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecycleViewActivity extends AppCompatActivity {

    private RecyclerView rvMahasiswa;
    private MahasiswaAdapter adapterMahasiswa;
    private ArrayList<Mahasiswa> mDataMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        addData();

        adapterMahasiswa = new MahasiswaAdapter(mDataMahasiswa);

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(adapterMahasiswa);

    }

    private void addData() {
        mDataMahasiswa = new ArrayList<>();
        mDataMahasiswa.add(new Mahasiswa("Febri Putra Tris Budiono", "E41192131", "082131916101"));
        mDataMahasiswa.add(new Mahasiswa("Radit", "E41192132", "12345678"));
        mDataMahasiswa.add(new Mahasiswa("Abril", "E41192133", "12345679"));
        mDataMahasiswa.add(new Mahasiswa("Gavin", "E41192130", "12345670"));
        mDataMahasiswa.add(new Mahasiswa("Putra", "E41192112", "21313211"));
        mDataMahasiswa.add(new Mahasiswa("Pratama", "E41182193", "21312311"));
        mDataMahasiswa.add(new Mahasiswa("Budianto", "E41121312", "12312311"));
    }
}