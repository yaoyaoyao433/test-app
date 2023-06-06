package com.tencent.mapsdk.internal;

import android.content.Context;
import android.widget.ListView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class px extends ListView {
    private a a;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void g();
    }

    public px(Context context) {
        super(context);
    }

    @Override // android.widget.AbsListView
    protected final void handleDataChanged() {
        super.handleDataChanged();
        if (this.a != null) {
            this.a.g();
        }
    }

    public final void setOnDataChangedListener(a aVar) {
        this.a = aVar;
    }
}
