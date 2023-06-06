package com.sankuai.waimai.platform.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b {
    public static ChangeQuickRedirect x;
    private View a;
    @NonNull
    public final Context y;
    @NonNull
    protected final LayoutInflater z;

    public abstract View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup);

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "011a7c17d459025d3643bdbcc9ec9335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "011a7c17d459025d3643bdbcc9ec9335");
        }
    }

    public b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88cd0ec1bc8d3fdcfee583b19b761430", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88cd0ec1bc8d3fdcfee583b19b761430");
            return;
        }
        this.y = context;
        this.z = LayoutInflater.from(context);
    }

    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c30ba80c8635a343a8cbabf70efed6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c30ba80c8635a343a8cbabf70efed6a");
        }
        if (this.a == null) {
            this.a = c.a(a(this.z, viewGroup), this.y, this);
            e();
        }
        return this.a;
    }

    public final View b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c01fa7fd87c1eac43af712aec57f2575", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c01fa7fd87c1eac43af712aec57f2575");
        }
        View a = a(viewGroup);
        viewGroup.removeAllViews();
        viewGroup.addView(a);
        return a;
    }

    @NonNull
    public final Context f() {
        return this.y;
    }

    @NonNull
    public final LayoutInflater g() {
        return this.z;
    }

    public View h() {
        return this.a;
    }

    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5ef4b3f4fc5444c73b4c816b492968e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5ef4b3f4fc5444c73b4c816b492968e");
        } else if (this.a != null) {
            this.a.setVisibility(0);
        }
    }

    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05acf248ce1336fde539e03499a9fa64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05acf248ce1336fde539e03499a9fa64");
        } else if (this.a != null) {
            this.a.setVisibility(8);
        }
    }

    public void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b0fc375fa173a63885573bc4c43e83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b0fc375fa173a63885573bc4c43e83");
        } else if (this.a != null) {
            this.a.setVisibility(z ? 0 : 8);
        }
    }
}
