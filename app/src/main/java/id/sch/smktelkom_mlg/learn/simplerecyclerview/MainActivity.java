package id.sch.smktelkom_mlg.learn.simplerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.simplerecyclerview.adapter.DataAdapter;
import id.sch.smktelkom_mlg.learn.simplerecyclerview.model.DataModel;

public class MainActivity extends AppCompatActivity {

    DataAdapter mDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        mDataAdapter = new DataAdapter(getDataList());
        recyclerView.setAdapter(mDataAdapter);

        setTitle("Staggered Grid Layout Manager RV");
    }

    public ArrayList<DataModel> getDataList() {

        ArrayList<DataModel> datas = new ArrayList<>();
        DataModel data = new DataModel("PBO", "Diajar oleh Bapak Arifin, Menggunakan Netbeans", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PPL", "Diajar oleh Ibu Ifa, Menggunakan Power Designer", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("PPB", "Diajar oleh Bapak Hendra, Menggunakan Aplikasi Android Studio", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("ProgDes", "Diajar oleh Bapak Hendro, Menggunakan Visual Studio", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("ProgWeb", "Diajar oleh Bapak Firdausa, Menggunakan Sublime Text", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("Basis Data", "Diajar oleh Ibu Ifa, Menggunakan XAMPP", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("RBJ", "Diajar oleh Bapak Hirga, Menggunakan Aplikasi Cisco Packet Tracer", ColorUtil.getRandomColor());
        datas.add(data);
        data = new DataModel("AdServ", "Diajar oleh Bapak Susanto, Menggunakan Virtual Box", ColorUtil.getRandomColor());
        datas.add(data);

        return datas;
    }
}
