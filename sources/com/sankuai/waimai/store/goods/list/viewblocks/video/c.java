package com.sankuai.waimai.store.goods.list.viewblocks.video;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.viewblocks.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.viewblocks.b {
    public static ChangeQuickRedirect a;
    d b;
    private a i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    interface a {
        boolean b();
    }

    public c(@NonNull Context context, com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.a aVar, a aVar2) {
        super(context, aVar);
        Object[] objArr = {context, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aac9753c98f0fb31b70a4c402dc1164", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aac9753c98f0fb31b70a4c402dc1164");
        } else {
            this.i = aVar2;
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.b
    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f10549295c3fa93a67fbbd8adb954c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f10549295c3fa93a67fbbd8adb954c1");
        } else if (z) {
            if (this.i != null) {
                if (this.i.b()) {
                    return;
                }
                super.a(true, z2);
                return;
            }
            super.a(true, z2);
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.store.viewblocks.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f929cd7c4dda93a5a2da34d3bf5bcb8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f929cd7c4dda93a5a2da34d3bf5bcb8c");
            return;
        }
        super.a();
        e();
    }

    @Override // com.sankuai.waimai.store.viewblocks.b
    public final com.sankuai.waimai.store.viewblocks.c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54941e07ddd236efabb7b1cde06de8eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.viewblocks.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54941e07ddd236efabb7b1cde06de8eb");
        }
        this.b = new d(this);
        return this.b;
    }

    public final void b(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c46d4611f58e29b4afa6d9f724f065e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c46d4611f58e29b4afa6d9f724f065e9");
        } else if (this.b != null) {
            this.b.a(i);
        }
    }
}
