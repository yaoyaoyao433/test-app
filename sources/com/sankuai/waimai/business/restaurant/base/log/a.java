package com.sankuai.waimai.business.restaurant.base.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final a g = new a();
    public int b;
    public long c;
    public int d;
    public long e;
    public int f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.base.log.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0818a {
        public static ChangeQuickRedirect a;

        public static int a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4be981ba7d83aced9f5529e61f507d55", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4be981ba7d83aced9f5529e61f507d55")).intValue();
            }
            if (i <= 0) {
                return 84000;
            }
            if (i <= 2) {
                return 84001;
            }
            if (i <= 4) {
                return 84002;
            }
            if (i <= 6) {
                return 84003;
            }
            if (i <= 8) {
                return 84004;
            }
            return i <= 10 ? 84005 : 84006;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;

        public static int a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa12941e08d5e2850295a32f3bf2b6a7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa12941e08d5e2850295a32f3bf2b6a7")).intValue();
            }
            if (j < 0) {
                return 94000;
            }
            if (j <= 150) {
                return 94001;
            }
            if (j <= 270) {
                return 94002;
            }
            if (j <= 330) {
                return 94003;
            }
            return j <= 900 ? 94004 : 94005;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        public static ChangeQuickRedirect a;

        public static int a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e086f6325cffb4613b6fe05eb9275d4e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e086f6325cffb4613b6fe05eb9275d4e")).intValue();
            }
            if (j <= 150) {
                return 74001;
            }
            if (j <= 270) {
                return 74002;
            }
            if (j <= 330) {
                return 74003;
            }
            return j <= 900 ? 74004 : 74005;
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d5724b19fd69760524d3634c4897f7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d5724b19fd69760524d3634c4897f7f");
            return;
        }
        this.b = 0;
        this.c = 0L;
        this.d = 0;
        this.e = 0L;
        this.f = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fb31ad22ed68e038e682a6ca57ad05f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fb31ad22ed68e038e682a6ca57ad05f");
        } else {
            this.e = j;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf5eff8e00ee5ec84207523c18d1fd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf5eff8e00ee5ec84207523c18d1fd1");
            return;
        }
        this.f++;
        a(-1L);
    }

    public long b() {
        return this.c / this.d;
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "716dd1941e35f44c3d2358eef0d85566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "716dd1941e35f44c3d2358eef0d85566");
            return;
        }
        this.b = 0;
        this.c = 0L;
        this.d = 0;
        this.e = 0L;
        this.f = 0;
    }

    public static a d() {
        return g;
    }
}
