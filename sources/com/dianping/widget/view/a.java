package com.dianping.widget.view;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.dianping.judas.interfaces.c;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static com.dianping.judas.expose.a b;
    private static a d;
    private b c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b70cd5f36f7985d80f759d10e8d514d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b70cd5f36f7985d80f759d10e8d514d2");
        } else {
            this.c = new b();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52be952fa2e0105875a6b940329937c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52be952fa2e0105875a6b940329937c8");
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    public final void a(final Activity activity, final String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff70f8835c6feac593ef16b22909dc4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff70f8835c6feac593ef16b22909dc4b");
            return;
        }
        final com.dianping.judas.expose.d a2 = com.dianping.judas.expose.d.a();
        Object[] objArr2 = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.judas.expose.d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9c8a3e778bd4f69fda2207ca760894ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9c8a3e778bd4f69fda2207ca760894ae");
        } else {
            a2.a(new Runnable() { // from class: com.dianping.judas.expose.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e00fc4ccca62bb8924f92c2c73dab2a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e00fc4ccca62bb8924f92c2c73dab2a9");
                    } else if (activity == null || activity.isFinishing() || TextUtils.isEmpty(str)) {
                    } else {
                        a2.a(activity, str).a();
                    }
                }
            }, 300L);
        }
    }

    public final void a(Activity activity, String str, boolean z) {
        Object[] objArr = {activity, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88262e2709cc646269430247dd3321a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88262e2709cc646269430247dd3321a9");
            return;
        }
        com.dianping.judas.expose.d a2 = com.dianping.judas.expose.d.a();
        Object[] objArr2 = {activity, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.judas.expose.d.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "7eb8db4dd091359783263c57d9c5ff6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "7eb8db4dd091359783263c57d9c5ff6b");
        } else {
            a2.a(activity, str).i = z;
        }
    }

    public final void a(String str, final View view, final int i) {
        Object[] objArr = {str, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bcd4ea7d6366653ae32916da8450737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bcd4ea7d6366653ae32916da8450737");
        } else if (b != null) {
            com.dianping.judas.expose.a aVar = b;
            Object[] objArr2 = {str, view, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.judas.expose.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "321127509590b8f0c15c95942c8f0b8b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "321127509590b8f0c15c95942c8f0b8b");
            } else if (TextUtils.isEmpty(str)) {
            } else {
                final com.dianping.judas.expose.b a2 = aVar.a(str);
                Object[] objArr3 = {view, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = com.dianping.judas.expose.b.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "ffb778bafea1d21a19e9d474207e565f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "ffb778bafea1d21a19e9d474207e565f");
                } else if (!(view instanceof com.dianping.judas.interfaces.c)) {
                    com.dianping.judas.util.a.a("view must implement GAViewDotter interface", new Object[0]);
                } else {
                    a2.c = i;
                    a2.d = i;
                    Object[] objArr4 = {view, Integer.valueOf(i), (byte) 1};
                    ChangeQuickRedirect changeQuickRedirect4 = com.dianping.judas.expose.b.a;
                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "3faa7b1617b4e71e3d835f83a3b34d6e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "3faa7b1617b4e71e3d835f83a3b34d6e");
                        return;
                    }
                    com.dianping.judas.interfaces.c cVar = (com.dianping.judas.interfaces.c) view;
                    if (cVar.b(c.a.VIEW) != null) {
                        if (TextUtils.isEmpty(cVar.b(c.a.VIEW).index)) {
                            EventInfo b2 = cVar.b(c.a.VIEW);
                            StringBuilder sb = new StringBuilder();
                            sb.append(i);
                            b2.index = sb.toString();
                        }
                        cVar.b(c.a.VIEW).event_type = Constants.EventType.VIEW;
                    } else if (cVar.getGAUserInfo() != null) {
                        cVar.getGAUserInfo().r = Integer.valueOf(i);
                    }
                    if (view != null) {
                        view.post(new Runnable() { // from class: com.dianping.judas.expose.b.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str2;
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f3d7f65b9046f5e149933a8214f5fa35", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f3d7f65b9046f5e149933a8214f5fa35");
                                    return;
                                }
                                b bVar = a2;
                                com.dianping.judas.interfaces.a aVar2 = a2.h.c;
                                View view2 = view;
                                int i2 = i;
                                String b3 = a2.h.c.b();
                                Object[] objArr6 = {aVar2, view2, Integer.valueOf(i2), b3};
                                ChangeQuickRedirect changeQuickRedirect6 = b.a;
                                if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "ff90c9282a3be6e82034cc2bcf14ac99", RobustBitConfig.DEFAULT_VALUE)) {
                                    str2 = (String) PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "ff90c9282a3be6e82034cc2bcf14ac99");
                                } else {
                                    StringBuilder sb2 = new StringBuilder(CommonConstant.Symbol.UNDERLINE);
                                    if (b3 == null) {
                                        b3 = aVar2.b();
                                    }
                                    sb2.append(b3);
                                    sb2.append(CommonConstant.Symbol.UNDERLINE);
                                    sb2.append(com.dianping.judas.util.b.c(view2));
                                    String sb3 = sb2.toString();
                                    com.dianping.widget.view.d b4 = com.dianping.judas.util.b.b(view2);
                                    if (b4 != null && b4.J) {
                                        sb3 = sb3 + CommonConstant.Symbol.UNDERLINE + b4.a();
                                    }
                                    str2 = sb3 + CommonConstant.Symbol.UNDERLINE + i2;
                                }
                                com.dianping.judas.util.c cVar2 = new com.dianping.judas.util.c(view, str2);
                                if (a2.g.containsKey(cVar2)) {
                                    a2.g.remove(cVar2);
                                }
                                a2.g.put(cVar2, str2);
                                b bVar2 = a2;
                                Object[] objArr7 = {str2};
                                ChangeQuickRedirect changeQuickRedirect7 = b.a;
                                if (PatchProxy.isSupport(objArr7, bVar2, changeQuickRedirect7, false, "6a96155402cc203bad1cce8cefba7d38", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr7, bVar2, changeQuickRedirect7, false, "6a96155402cc203bad1cce8cefba7d38")).booleanValue() : bVar2.f.contains(str2)) {
                                    return;
                                }
                                com.dianping.judas.util.c cVar3 = new com.dianping.judas.util.c(view, str2);
                                if (a2.e.containsKey(cVar3)) {
                                    a2.e.remove(cVar3);
                                }
                                a2.e.put(cVar3, str2);
                                if (r4) {
                                    a2.a(false);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public final void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd32fca9b19fe3838d1108850e957653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd32fca9b19fe3838d1108850e957653");
        } else if (b != null) {
            b.a(str, i, i2);
        }
    }

    public final void a(View view, String str, EventName eventName) {
        Object[] objArr = {view, str, eventName};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d2e0cde5861cf8c768d4f7679efc88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d2e0cde5861cf8c768d4f7679efc88");
        } else {
            a(view, Integer.MAX_VALUE, str, eventName);
        }
    }

    public final void a(View view, int i, String str, EventName eventName) {
        Object[] objArr = {view, Integer.valueOf(i), str, eventName};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e77d3aa3d32dcc4c5c16a173a9fc8d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e77d3aa3d32dcc4c5c16a173a9fc8d9");
        } else {
            a(view, i, str, a(str), eventName);
        }
    }

    public final void a(View view, int i, String str, String str2, EventName eventName) {
        Object[] objArr = {view, Integer.valueOf(i), str, str2, eventName};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78432ef560f3b289f821d5dacf060140", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78432ef560f3b289f821d5dacf060140");
        } else if (!(view instanceof com.dianping.judas.interfaces.c)) {
            com.dianping.judas.util.a.b("view must implement GAViewDotter interface", new Object[0]);
        } else {
            a(view);
            String d2 = com.dianping.judas.util.b.d(view);
            EventInfo a2 = com.dianping.judas.util.b.a(view, str);
            if (i != Integer.MAX_VALUE && TextUtils.isEmpty(a2.index)) {
                a2.index = String.valueOf(i);
            }
            a2.event_type = str;
            a2.nm = eventName;
            a2.isAuto = 4;
            if (TextUtils.isEmpty(a2.val_bid) && !TextUtils.isEmpty(a2.element_id)) {
                a2.val_bid = Statistics.getPageName() + CommonConstant.Symbol.UNDERLINE + a2.element_id + CommonConstant.Symbol.UNDERLINE + str2;
            }
            if (TextUtils.isEmpty(a2.val_bid)) {
                return;
            }
            a(a2, d2);
            if (this.c.d != null) {
                Statistics.getPageName();
                b(view);
            }
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdb0622b62d15e685812f511ae3d7e56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdb0622b62d15e685812f511ae3d7e56");
        } else if (view == null) {
        } else {
            try {
                Context context = view.getContext();
                if (context == null || !(context instanceof com.dianping.judas.interfaces.a)) {
                    return;
                }
                new HashMap();
                new HashMap();
            } catch (Throwable th) {
                com.dianping.judas.util.a.b("updateViewDotterByActivityInfo" + th.getMessage(), new Object[0]);
            }
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84fb371d422bf57d3a327021dce5b230", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84fb371d422bf57d3a327021dce5b230") : str.equals("click") ? "tap" : str;
    }

    private synchronized void a(EventInfo eventInfo, String str) {
        Object[] objArr = {eventInfo, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7976ac8d58acd994af02937d02e02451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7976ac8d58acd994af02937d02e02451");
        } else if (TextUtils.isEmpty(str)) {
            Statistics.getChannel().writeEvent(eventInfo);
        } else {
            Statistics.getChannel(str).writeEvent(eventInfo);
        }
    }

    @Nullable
    @Deprecated
    private d b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da61ac0b43aa30850f6b8284782f768f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da61ac0b43aa30850f6b8284782f768f") : com.dianping.judas.util.b.b(view);
    }

    @Deprecated
    public final void a(com.dianping.judas.interfaces.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a21eaedd5a881bd8bdc543ebc0fa283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a21eaedd5a881bd8bdc543ebc0fa283");
            return;
        }
        b bVar = this.c;
        Object[] objArr2 = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "aa30e763d5fffe46b263110b433ec83b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "aa30e763d5fffe46b263110b433ec83b");
            return;
        }
        Map map = null;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (bVar.a((String) entry.getValue(), str)) {
                        bVar.a(aVar, (View) entry.getKey(), (String) entry.getValue());
                    }
                } else {
                    bVar.a(aVar, (View) entry.getKey(), (String) entry.getValue());
                }
            } else {
                it.remove();
            }
        }
    }
}
