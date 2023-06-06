package com.sankuai.waimai.touchmatrix.data;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.data.AlertInfo;
import com.sankuai.waimai.touchmatrix.data.TMatrixShowInfo;
import java.util.Collections;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public int d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public TMatrixShowInfo k;
    public String l;
    private int m;

    public final int a() {
        if (this.k != null) {
            return this.k.touchMode;
        }
        return -1;
    }

    public final TMatrixShowInfo.a b() {
        if (this.k != null) {
            return this.k.condition;
        }
        return null;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1be771f386667e4663a565a9e8ba85eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1be771f386667e4663a565a9e8ba85eb");
        } else {
            this.m++;
        }
    }

    public final boolean d() {
        return this.j > 0 && this.i > 0 && this.m < this.j;
    }

    public final Map<String, Object> e() {
        if (this.k != null && this.k.businessData != null && this.k.businessData.traceInfo != null) {
            return this.k.businessData.traceInfo;
        }
        return Collections.EMPTY_MAP;
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b77dc30426b811165a4cf6f5c673e094", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b77dc30426b811165a4cf6f5c673e094");
        }
        if (this.k == null || this.k.businessData == null || this.k.businessData.modules == null) {
            return "";
        }
        for (AlertInfo.Module module : this.k.businessData.modules) {
            if (module != null && !TextUtils.isEmpty(module.templateId)) {
                return module.templateId;
            }
        }
        return "";
    }
}
