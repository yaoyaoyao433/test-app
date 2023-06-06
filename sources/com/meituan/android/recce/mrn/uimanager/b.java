package com.meituan.android.recce.mrn.uimanager;

import android.view.View;
import com.meituan.android.recce.props.gens.PropVisitor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface b {
    PropVisitor<Void> getVisitor(View view);

    void recceOnAfterUpdateTransaction(View view);
}
