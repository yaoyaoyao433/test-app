package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCCompatibleScrollView extends FixedScrollView {
    public static ChangeQuickRedirect b;
    private final int c;
    private a d;
    private Handler e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public SCCompatibleScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea12bf4ad12b7032aae58dd55fbbcc8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea12bf4ad12b7032aae58dd55fbbcc8e");
            return;
        }
        this.c = 100;
        this.d = null;
        this.e = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.newwidgets.SCCompatibleScrollView.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a93a05e0c8f06cb3022d21f658f43006", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a93a05e0c8f06cb3022d21f658f43006");
                    return;
                }
                super.handleMessage(message);
                if (message.what != 100 || SCCompatibleScrollView.this.d == null) {
                    return;
                }
                a unused = SCCompatibleScrollView.this.d;
            }
        };
    }

    public SCCompatibleScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f35f39222357b6e35054f10d64d7ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f35f39222357b6e35054f10d64d7ae");
            return;
        }
        this.c = 100;
        this.d = null;
        this.e = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.newwidgets.SCCompatibleScrollView.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a93a05e0c8f06cb3022d21f658f43006", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a93a05e0c8f06cb3022d21f658f43006");
                    return;
                }
                super.handleMessage(message);
                if (message.what != 100 || SCCompatibleScrollView.this.d == null) {
                    return;
                }
                a unused = SCCompatibleScrollView.this.d;
            }
        };
    }

    public SCCompatibleScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b6e92cbf649ed6f31d83fe528c171a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b6e92cbf649ed6f31d83fe528c171a");
            return;
        }
        this.c = 100;
        this.d = null;
        this.e = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.newwidgets.SCCompatibleScrollView.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a93a05e0c8f06cb3022d21f658f43006", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a93a05e0c8f06cb3022d21f658f43006");
                    return;
                }
                super.handleMessage(message);
                if (message.what != 100 || SCCompatibleScrollView.this.d == null) {
                    return;
                }
                a unused = SCCompatibleScrollView.this.d;
            }
        };
    }

    public void setOnScrollListener(a aVar) {
        this.d = aVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e56e2639ed445ac1f7495fb0f74d58b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e56e2639ed445ac1f7495fb0f74d58b");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.e.hasMessages(100)) {
            this.e.removeMessages(100);
        }
        this.e.sendEmptyMessageDelayed(100, 100L);
    }
}
