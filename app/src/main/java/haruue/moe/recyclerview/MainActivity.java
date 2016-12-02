package haruue.moe.recyclerview;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化RecyclerView，注意要在Gradle里导包
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
        //设置LayoutManager，它决定了怎么来布局
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //设置Adapter，Adapter的构造方法一般会传ArrayList进去
        recyclerView.setAdapter(new MyAdapter(15));

        Button but = (Button) findViewById(R.id.EXIT);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
