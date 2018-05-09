package com.example.android.new_nds_study.view;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;



public class itemAttachCallBack extends ItemTouchHelper.Callback {
    private AdapterHelper adapterHelper;

    public itemAttachCallBack(AdapterHelper adapterHelper) {
        this.adapterHelper = adapterHelper;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int flag = ItemTouchHelper.UP | ItemTouchHelper.DOWN | ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
        return makeMovementFlags(flag,0);
    }

    @Override
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        adapterHelper.onItemMove(viewHolder, target);
        return true;
    }

    @Override
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
        if (actionState != ItemTouchHelper.ACTION_STATE_IDLE)
            adapterHelper.onItemSelect(viewHolder);
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

    }

    @Override
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
            adapterHelper.onItemClear(viewHolder);
    }

    public interface AdapterHelper {
        void onItemMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target);
        void onItemClear(RecyclerView.ViewHolder viewHolder);
        void onItemSelect(RecyclerView.ViewHolder viewHolder);
    }
}
