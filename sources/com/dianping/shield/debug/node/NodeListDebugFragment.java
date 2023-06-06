package com.dianping.shield.debug.node;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dianping.shield.debug.NodeListDataStoreSnapshot;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NodeListDebugFragment extends Fragment implements NodeUpdateInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private RecyclerView recyclerView;

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e929b55fe723b704ee8cb63ee838bc9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e929b55fe723b704ee8cb63ee838bc9d");
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        NodeTitleLayout nodeTitleLayout = new NodeTitleLayout(getContext(), "节点列表", new View.OnClickListener() { // from class: com.dianping.shield.debug.node.NodeListDebugFragment.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "988fe27a31c59001769d3cf34bab4509", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "988fe27a31c59001769d3cf34bab4509");
                } else {
                    NodeListDebugFragment.this.getActivity().finish();
                }
            }
        });
        nodeTitleLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        nodeTitleLayout.setBackgroundColor(Color.parseColor("#F1F1F1"));
        linearLayout.addView(nodeTitleLayout);
        this.recyclerView = new RecyclerView(getContext());
        linearLayout.addView(this.recyclerView, new LinearLayout.LayoutParams(-1, -1));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        this.recyclerView.setAdapter(new NodeListAdapter(NodeListDataStoreSnapshot.getSingleton().getAllDataTempo(), getContext(), this));
        this.recyclerView.getItemAnimator().setChangeDuration(100L);
        this.recyclerView.getItemAnimator().setMoveDuration(100L);
        return linearLayout;
    }

    @Override // com.dianping.shield.debug.node.NodeUpdateInterface
    public void showUpdateFragment(int i, int i2, RecyclerView.a aVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab52e9e1028180abf071d8ca63d69f34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab52e9e1028180abf071d8ca63d69f34");
            return;
        }
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("dialog");
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        beginTransaction.addToBackStack(null);
        EditNodeFragment.newInstance(i, i2, aVar).show(getFragmentManager(), "dialog");
    }
}
