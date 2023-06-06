package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes6.dex */
public final class cf {
    private static int a(Context context, int i) {
        int b = gt.b(context);
        if (-1 == b) {
            return -1;
        }
        return (i * (b == 0 ? 13 : 11)) / 10;
    }

    private static void a(String str, Context context, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int a = a(context, i2);
        if (i != dr.a(hl.UploadTinyData)) {
            ds.a(context.getApplicationContext()).a(str, i, 1L, a);
        }
    }

    public static void a(String str, Context context, il ilVar, ha haVar, int i) {
        a(str, context, a(ilVar, haVar), i);
    }

    private static int a(il ilVar, ha haVar) {
        int b;
        int a;
        switch (cg.a[haVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return dr.b(haVar.L);
            case 11:
                b = dr.b(haVar.L);
                if (ilVar != null) {
                    try {
                        if (ilVar instanceof hs) {
                            String str = ((hs) ilVar).e;
                            if (!TextUtils.isEmpty(str) && dr.a(dr.a(str)) != -1) {
                                a = dr.a(dr.a(str));
                                return a;
                            }
                        } else if (ilVar instanceof ia) {
                            String str2 = ((ia) ilVar).e;
                            if (!TextUtils.isEmpty(str2)) {
                                if (dr.a(dr.a(str2)) != -1) {
                                    b = dr.a(dr.a(str2));
                                }
                                if (hl.UploadTinyData.equals(dr.a(str2))) {
                                    return -1;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        com.xiaomi.channel.commonutils.logger.c.d("PERF_ERROR : parse Notification type error");
                        return b;
                    }
                }
                return b;
            case 12:
                b = dr.b(haVar.L);
                if (ilVar != null) {
                    try {
                        if (ilVar instanceof hw) {
                            String str3 = ((hw) ilVar).d;
                            if (!TextUtils.isEmpty(str3) && ep.a(str3) != -1) {
                                a = ep.a(str3);
                            }
                        } else if (ilVar instanceof hv) {
                            String str4 = ((hv) ilVar).d;
                            if (!TextUtils.isEmpty(str4) && ep.a(str4) != -1) {
                                a = ep.a(str4);
                            }
                        }
                        return a;
                    } catch (Exception unused2) {
                        com.xiaomi.channel.commonutils.logger.c.d("PERF_ERROR : parse Command type error");
                    }
                }
                return b;
            default:
                return -1;
        }
    }

    private static int a(ha haVar) {
        return dr.b(haVar.L);
    }

    public static void a(String str, Context context, hx hxVar, int i) {
        ha haVar;
        if (context == null || hxVar == null || (haVar = hxVar.a) == null) {
            return;
        }
        int a = a(haVar);
        if (i <= 0) {
            byte[] a2 = ik.a(hxVar);
            i = a2 != null ? a2.length : 0;
        }
        a(str, context, a, i);
    }
}
