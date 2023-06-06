package com.sankuai.waimai.platform.domain.core.response;

import android.content.Context;
import android.os.Handler;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    int b;
    public boolean c;
    public int d;
    private Context e;
    private String f;
    private Handler g;
    private InterfaceC1045a h;
    private Runnable i;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.domain.core.response.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1045a {
    }

    public static boolean a(int i) {
        return i == 500 || i == 555;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40bdfaabe94c8cd027118b951fb12797", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40bdfaabe94c8cd027118b951fb12797");
            return;
        }
        this.e = b.a;
        this.b = 0;
        this.c = false;
        this.d = 0;
        this.h = null;
        this.i = new Runnable() { // from class: com.sankuai.waimai.platform.domain.core.response.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7318594cb2b3860216276ba67c292bb2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7318594cb2b3860216276ba67c292bb2");
                    return;
                }
                a.this.b = 0;
                a.this.d = 0;
                a.this.c = false;
            }
        };
    }

    public final boolean a(BaseResponse baseResponse) {
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40b1486c2f154f4ad7ee824293d19ced", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40b1486c2f154f4ad7ee824293d19ced")).booleanValue();
        }
        if (baseResponse == null) {
            return true;
        }
        if (baseResponse.code == 801 || baseResponse.code == 802) {
            this.c = true;
            if (baseResponse.data instanceof ServerExpResponse) {
                this.d = ((ServerExpResponse) baseResponse.data).getWaitTime() * 1000;
                b();
            }
        } else {
            this.c = false;
        }
        this.f = baseResponse.msg;
        this.b = baseResponse.code;
        return this.c;
    }

    public final boolean a(int i, String str, ServerExpResponse serverExpResponse) {
        Object[] objArr = {Integer.valueOf(i), str, serverExpResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b5772b4ac1abe5a14c547c1e23ab44", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b5772b4ac1abe5a14c547c1e23ab44")).booleanValue();
        }
        if (serverExpResponse == null) {
            return true;
        }
        if (i == 801 || i == 802) {
            this.c = true;
            this.d = serverExpResponse.getWaitTime() * 1000;
            b();
        } else {
            this.c = false;
        }
        this.f = str;
        this.b = i;
        return this.c;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c862f973650c201f82b6cae36c4b1049", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c862f973650c201f82b6cae36c4b1049");
        }
        if (TextUtils.isEmpty(this.f)) {
            this.f = this.e.getString(R.string.wm_loading_fail_try_afterwhile);
        }
        return this.f;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b7aca6427b319936896e8b3f6512be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b7aca6427b319936896e8b3f6512be5");
        } else if (this.d > 0) {
            this.c = true;
            if (this.g == null) {
                this.g = new Handler();
                this.g.postDelayed(this.i, this.d);
                return;
            }
            this.g.postDelayed(this.i, this.d);
        } else {
            this.b = 0;
            this.d = 0;
            this.c = false;
        }
    }
}
