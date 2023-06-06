package com.sankuai.meituan.xp.stat;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.common.c;
import com.sankuai.meituan.mtliveqos.e;
import com.sankuai.meituan.xp.core.XPlayer;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends a {
    public static ChangeQuickRedirect s;

    public b(Context context, XPlayer xPlayer, com.sankuai.meituan.mtliveqos.utils.a aVar) {
        super(context, xPlayer, aVar);
        Object[] objArr = {context, xPlayer, aVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65215b270b9771b1908c58c3b9aa7bbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65215b270b9771b1908c58c3b9aa7bbb");
        } else {
            this.r = c.f.PLAY;
        }
    }

    @Override // com.sankuai.meituan.xp.stat.a
    public final void a(int i, int i2, int i3, Object obj) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b9262f6214067b32891d92af925b198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b9262f6214067b32891d92af925b198");
        } else if (2101 == i) {
            if (f()) {
                return;
            }
            String str = (String) obj;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = s;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e44b1cba2dba5f9d6ecd42e356faee68", RobustBitConfig.DEFAULT_VALUE)) {
                ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e44b1cba2dba5f9d6ecd42e356faee68")).longValue();
            } else if (TextUtils.isEmpty(str)) {
            } else {
                String[] split = str.split(CommonConstant.Symbol.UNDERLINE);
                if (split.length < 4) {
                    a("", "", "reportLatency :" + str);
                    return;
                }
                long parseLong = Long.parseLong(split[0]);
                long parseLong2 = Long.parseLong(split[1]);
                long parseLong3 = Long.parseLong(split[2]);
                long parseLong4 = Long.parseLong(split[3]);
                Map<String, Float> hashMap = new HashMap<>();
                Map<String, String> hashMap2 = new HashMap<>();
                long j = parseLong4 - parseLong;
                if (j > 0) {
                    long j2 = parseLong2 - parseLong;
                    long j3 = parseLong3 - parseLong2;
                    long j4 = parseLong4 - parseLong3;
                    if (j2 < 0 || j3 < 0 || j4 < 0) {
                        return;
                    }
                    hashMap.put("MTLIVE_LATENCY_ALL", Float.valueOf((float) j));
                    hashMap.put("MTLIVE_LATENCY_READ", Float.valueOf((float) j2));
                    hashMap.put("MTLIVE_LATENCY_READ_DECODE", Float.valueOf((float) j3));
                    hashMap.put("MTLIVE_LATENCY_DECODE_RENDER", Float.valueOf((float) j4));
                    String.format("\nLatency: %dms\nRead: %dms\nReadDecode: %dms\nDecodeRender: %dms\n", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
                    a(hashMap, hashMap2);
                    return;
                }
                a("startTimestamp: " + parseLong + ",readTimestamp: " + parseLong2 + ",decodeTimestamp: " + parseLong3 + ",renderTimestamp: " + parseLong4);
                a("", "", "startTimestamp: " + parseLong + ",readTimestamp: " + parseLong2 + ",decodeTimestamp: " + parseLong3 + ",renderTimestamp: " + parseLong4);
            }
        } else if (11002 == i) {
            if (f()) {
                return;
            }
            String str2 = (String) obj;
            Object[] objArr3 = {str2};
            ChangeQuickRedirect changeQuickRedirect3 = s;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4f1d355ae6650a5cd45b819f76502df6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4f1d355ae6650a5cd45b819f76502df6");
            } else if (TextUtils.isEmpty(str2)) {
            } else {
                String[] split2 = str2.split(CommonConstant.Symbol.UNDERLINE);
                if (split2.length > 0) {
                    String str3 = split2[split2.length - 1];
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            return;
                        }
                        if (str3.contains(CommonConstant.Symbol.DOT)) {
                            str3 = str3.substring(0, str3.indexOf(CommonConstant.Symbol.DOT));
                        }
                        long parseLong5 = Long.parseLong(str3);
                        long b = com.meituan.android.time.c.b();
                        long abs = Math.abs(b - parseLong5);
                        if (abs > 0) {
                            StringBuilder sb = new StringBuilder(" handleReceiveSeiFrame all_link_latency: ");
                            sb.append(abs);
                            sb.append(", now: ");
                            sb.append(b);
                            sb.append(" , pusherTime: ");
                            sb.append(parseLong5);
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("MTLIVE_LATENCY_P2P", Float.valueOf((float) abs));
                            Object[] objArr4 = {new Long(b)};
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "471da43ac3d31e0ecd2ad1f1266ffd16", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "471da43ac3d31e0ecd2ad1f1266ffd16");
                            } else {
                                Context context = this.c;
                                com.sankuai.meituan.mtliveqos.statistic.b a = super.a(false);
                                String str4 = c.b.MTLIVE_EVENT_SYNC_CLOCK.C;
                                e.a(context, a, str4, b + CommonConstant.Symbol.UNDERLINE + com.meituan.android.time.c.a(), null);
                            }
                            a(hashMap3, (Map<String, String>) null);
                            return;
                        }
                        a("originTime: " + System.currentTimeMillis() + ", fixedTime: " + b + "，pusherTime：" + parseLong5);
                        a("", "", "originTime: " + System.currentTimeMillis() + ", fixedTime: " + b + "，pusherTime：" + parseLong5);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            super.a(i, i2, i3, obj);
        }
    }
}
