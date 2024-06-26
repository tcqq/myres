package com.android.myres.ui.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;

import com.android.myres.R;
import com.android.myres.common.base.BaseActivity;
import com.android.myres.databinding.ActivityKitchenWorkerHomeBinding;
import com.android.myres.ui.order.UpdateOrderStatusActivity;
import com.android.myres.ui.order.ViewOrdersActivity;

/**
 * Kitchen worker home page with order list and status updates
 */
public class KitchenWorkerHomeActivity extends BaseActivity {

    private ActivityKitchenWorkerHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_kitchen_worker_home);
        setActionBar(binding.toolbar);
        setActionBarTitle("Kitchen Worker");

        binding.viewOrdersButton.setOnClickListener(v -> startActivity(new Intent(this, ViewOrdersActivity.class)));
        binding.updateOrderStatusButton.setOnClickListener(v -> startActivity(new Intent(this, UpdateOrderStatusActivity.class)));
    }
}