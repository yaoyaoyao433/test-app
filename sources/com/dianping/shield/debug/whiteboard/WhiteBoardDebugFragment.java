package com.dianping.shield.debug.whiteboard;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class WhiteBoardDebugFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcaee8b75e1cec6847b0007ef0f0dbff", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcaee8b75e1cec6847b0007ef0f0dbff");
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        TitleLayout titleLayout = new TitleLayout(getContext());
        titleLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(titleLayout);
        RecyclerView recyclerView = new RecyclerView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        recyclerView.setBackgroundColor(Color.parseColor("#ffffff"));
        linearLayout.addView(recyclerView, layoutParams);
        new WhiteBoardPanel(getContext(), recyclerView, titleLayout);
        return linearLayout;
    }
}
