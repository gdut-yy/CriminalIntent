package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

/**
 * controller 类
 */
public class CrimeListActivity extends SingleFragmentActivity {



    @Override
    protected Fragment createFragment( ) {
        return new CrimeListFragment();
    }
}
