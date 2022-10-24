package com.bkm.worktalk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class Fragment extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragProject fragProject;
//    private FragTalk fragTalk;
//    private FragSettings fragSettings;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        fragmentManager = getSupportFragmentManager();

        fragProject = new FragProject();

        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout, fragProject).commitAllowingStateLoss();

        findViewById(R.id.iv_project).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            transaction = fragmentManager.beginTransaction();

            switch(v.getId())
            {
                case R.id.iv_project:
                    transaction.replace(R.id.framelayout, fragProject).commitAllowingStateLoss();
                    break;

            }
        }
    };
}