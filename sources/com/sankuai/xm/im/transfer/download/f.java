package com.sankuai.xm.im.transfer.download;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.utils.MessageUtils;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f implements e {
    public static ChangeQuickRedirect a;
    private static f b = new f();
    private a c;

    @Override // com.sankuai.xm.im.transfer.download.e
    public final int a() {
        return 2;
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "949279e0537bd9e681f52fc167300f5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "949279e0537bd9e681f52fc167300f5f");
        } else {
            this.c = new a();
        }
    }

    public static f c() {
        return b;
    }

    @Override // com.sankuai.xm.im.transfer.download.e
    public final Comparator b() {
        return this.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Comparator<d> {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(d dVar, d dVar2) {
            int i;
            d dVar3 = dVar;
            d dVar4 = dVar2;
            Object[] objArr = {dVar3, dVar4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa7b605ca8146ec5fc728831e59b5d4", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa7b605ca8146ec5fc728831e59b5d4")).intValue();
            }
            long j = dVar3.f - dVar4.f;
            if (dVar3.e < dVar4.e) {
                return 1;
            }
            if (dVar3.e <= dVar4.e && j <= 0) {
                return i < 0 ? 1 : 0;
            }
            return -1;
        }
    }

    @Override // com.sankuai.xm.im.transfer.download.e
    public final boolean a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e20d4446ac38088f76e2705c92728af0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e20d4446ac38088f76e2705c92728af0")).booleanValue();
        }
        if (dVar == null) {
            return false;
        }
        if (dVar.b == null) {
            return true;
        }
        if (TextUtils.isEmpty(dVar.g) || TextUtils.isEmpty(dVar.h)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = dVar.e == 1 || currentTimeMillis <= dVar.b.getSts() || currentTimeMillis - dVar.b.getSts() < 604800000;
        boolean b2 = IMClient.a().j().b(SessionId.a(dVar.b));
        if ((dVar.b.getCategory() != 2 && !MessageUtils.isPubService(dVar.b.getCategory())) || b2 || dVar.e == 1) {
            return z;
        }
        return false;
    }
}
