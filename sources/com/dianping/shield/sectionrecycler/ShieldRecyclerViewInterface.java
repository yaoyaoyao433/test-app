package com.dianping.shield.sectionrecycler;

import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ShieldRecyclerViewInterface {
    int getHeaderCount();

    int getShieldAdapterItemCount();

    int getShieldChildAdapterPosition(View view);

    View getShieldChildAt(int i);

    int getShieldChildCount();
}
