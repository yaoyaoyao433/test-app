package com.dianping.live.report;

import com.dianping.live.live.utils.e;
import com.dianping.live.live.utils.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public double b;
    public double c;
    public boolean d;
    public boolean e;
    public boolean f;

    public static /* synthetic */ double a(c cVar, Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "2c090595e6926a6bf0ad5f084114f5d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "2c090595e6926a6bf0ad5f084114f5d9")).doubleValue();
        }
        if (cVar.c == 0.0d && cVar.d && !bool.booleanValue()) {
            cVar.c = -3.0d;
        } else if (cVar.c == 0.0d) {
            cVar.c = -5.0d;
        }
        return cVar.c;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54acbcde952a357ff7e7bca7c6c859bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54acbcde952a357ff7e7bca7c6c859bc");
            return;
        }
        this.b = 0.0d;
        this.c = 0.0d;
        this.d = true;
        this.e = false;
        this.f = false;
    }

    public final void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b7728d3d2435dbbf617232c85151ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b7728d3d2435dbbf617232c85151ba");
        } else if (this.e) {
        } else {
            this.b = 1.0d;
            final HashMap hashMap = new HashMap();
            hashMap.put("MLIVE_PLAY_SUCCESS_DATA", Double.valueOf(this.b));
            com.dianping.live.live.utils.c.a("play_success", new e() { // from class: com.dianping.live.report.c.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.live.live.utils.e
                public final void a(String str2, Object obj, boolean z) {
                    Object[] objArr2 = {str2, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ff48ef1e3c9cfe85b29491d6b079855", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ff48ef1e3c9cfe85b29491d6b079855");
                    } else if (str2 == "play_success" && obj.equals(Boolean.TRUE) && z) {
                        d.b.a(str, "MLIVE_PLAY_SUCCESS", 0.0d, hashMap);
                    }
                }
            });
            this.e = true;
        }
    }

    public final void a(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db127f2a6c826058ab7c2c577611de06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db127f2a6c826058ab7c2c577611de06");
        } else if (this.b == 1.0d) {
        } else {
            this.c = d;
            if (this.c == -1.0d || this.c == -2.0d) {
                this.b = 0.0d;
                a(str, 1, 0.0d, false);
            }
        }
    }

    public final void a(final String str, final int i, final double d, final boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeeb64ba24d681c507534d92df9d9650", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeeb64ba24d681c507534d92df9d9650");
            return;
        }
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        com.dianping.live.live.utils.c.a(new com.dianping.live.live.utils.d() { // from class: com.dianping.live.report.c.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.live.live.utils.d
            public final void a(Map<String, Object> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cea9449222f3c3b639bcb6ac3b23cc78", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cea9449222f3c3b639bcb6ac3b23cc78");
                } else if (map != null && map.get("isOpen") != null && ((Boolean) map.get("isOpen")).booleanValue() && map.containsKey("play_success") && map.containsKey("play_fail_code") && map.containsKey("exit_wait_time")) {
                    boolean booleanValue = ((Boolean) map.get("play_success")).booleanValue();
                    boolean booleanValue2 = ((Boolean) map.get("play_fail_code")).booleanValue();
                    boolean booleanValue3 = ((Boolean) map.get("exit_wait_time")).booleanValue();
                    if (!c.this.e && booleanValue) {
                        hashMap.put("MLIVE_PLAY_SUCCESS", Double.valueOf(0.0d));
                        hashMap2.put("MLIVE_PLAY_SUCCESS_DATA", Double.valueOf(c.this.b));
                        c.this.e = true;
                    }
                    if (!c.this.f && c.this.b != 1.0d && booleanValue2) {
                        hashMap.put("MLIVE_PLAY_FAIL_CODE", Double.valueOf(0.0d));
                        hashMap2.put("MLIVE_PLAY_FAIL_CODE_DATA", Double.valueOf(c.a(c.this, Boolean.valueOf(z))));
                        c.this.f = true;
                        j.a("MLive_Logan: Player 播放失败 liveId " + str + " MLIVE_PLAY_FAIL_CODE " + c.a(c.this, Boolean.valueOf(z)));
                    }
                    if (i == 2 && booleanValue3 && c.this.b != 1.0d) {
                        hashMap.put("MLIVE_EXIT_WAIT_TIME", Double.valueOf(d));
                    }
                    if (hashMap.isEmpty()) {
                        return;
                    }
                    d.b.a(str, hashMap, hashMap2);
                }
            }
        });
    }
}
