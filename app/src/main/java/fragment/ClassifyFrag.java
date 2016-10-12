package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sanfuproject.R;

import org.xutils.x;

import static com.example.sanfuproject.activity.utils.Constants.drawerLayout;

/**
 * Created by Hello on 2016/10/11.
 */

public class ClassifyFrag extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_classify, null);
        init();
        //x.view().inject(view);
        return view;
    }

    private void init() {
        Button button = (Button) view.findViewById(R.id.open);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.RIGHT);
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED, Gravity.RIGHT);
            }
        });
    }


    //按钮的点击事件必须用private进行修饰(使用失败)
//    @Event(value = R.id.open, type = View.OnClickListener.class)
//    private void search(View view) {
//        System.out.println("--456");
//        drawerLayout.openDrawer(Gravity.RIGHT);
//    }


}
