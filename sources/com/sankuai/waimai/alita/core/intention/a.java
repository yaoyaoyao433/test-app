package com.sankuai.waimai.alita.core.intention;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import com.sankuai.waimai.alita.core.intention.b;
import com.sankuai.waimai.alita.core.utils.b;
import com.sankuai.waimai.alita.core.utils.f;
import com.sankuai.waimai.alita.core.utils.k;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Executor d = com.sankuai.android.jarvis.c.a("intention_observer_thread");
    public final ConcurrentHashMap<String, AlitaIntention> b;
    public final String c;
    private final b e;
    private final b f;

    private static String a(int i) {
        switch (i) {
            case 1:
                return "update";
            case 2:
                return "remove";
            default:
                return "unknown";
        }
    }

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a90570822dd273914cadd0f1f11a7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a90570822dd273914cadd0f1f11a7c");
            return;
        }
        this.e = new b();
        this.f = new b();
        this.b = new ConcurrentHashMap<>();
        this.c = str;
    }

    public final Map<String, AlitaIntention> a(List<String> list) {
        AlitaIntention alitaIntention;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a23196f509306fc29760dd0a8d8023", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a23196f509306fc29760dd0a8d8023");
        }
        if (f.a(list)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : list) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7547d9715554bdbc65a3e7a79d61c438", RobustBitConfig.DEFAULT_VALUE)) {
                alitaIntention = (AlitaIntention) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7547d9715554bdbc65a3e7a79d61c438");
            } else {
                AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.Intention.READ, com.sankuai.waimai.alita.platform.utils.b.b(), this.c).addTags("name", str).commit();
                alitaIntention = com.sankuai.waimai.alita.platform.utils.b.a() ? null : this.b.get(str);
            }
            if (alitaIntention != null) {
                hashMap.put(str, alitaIntention);
            }
        }
        return hashMap;
    }

    public final d a(String str, b.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "615c89ec2b8d46b9d00db79cbe4677fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "615c89ec2b8d46b9d00db79cbe4677fa");
        }
        AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.Intention.SCENE_KEY_OBSERVE, 1, this.c).addTags("name", str).commit();
        com.sankuai.waimai.alita.core.utils.c.a(new b.a().a("alita_intention").c(this.c).a(b.EnumC0714b.DEBUG).b("scene_key_observer").a("name", str).a());
        return this.f.a(str, aVar);
    }

    public void a(int i, AlitaIntention alitaIntention, AlitaIntention alitaIntention2, com.sankuai.waimai.alita.core.event.a aVar) {
        String str;
        Object[] objArr = {Integer.valueOf(i), alitaIntention, alitaIntention2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cabcffe29bf60eb20c448d088779fc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cabcffe29bf60eb20c448d088779fc2");
        } else if (com.sankuai.waimai.alita.platform.utils.b.a()) {
        } else {
            a(alitaIntention, alitaIntention2, i);
            String str2 = null;
            if (alitaIntention != null) {
                str = alitaIntention.d;
            } else {
                str = alitaIntention2 != null ? alitaIntention2.d : null;
            }
            if (alitaIntention != null) {
                str2 = alitaIntention.e;
            } else if (alitaIntention2 != null) {
                str2 = alitaIntention2.e;
            }
            if (!TextUtils.isEmpty(str)) {
                this.e.a(str, alitaIntention, alitaIntention2);
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f.a(str2, alitaIntention, alitaIntention2);
            }
            AlitaRealTimeEventCenter.getInstance().writeAlitaCustomEvent(this.c, aVar);
        }
    }

    private void a(AlitaIntention alitaIntention, AlitaIntention alitaIntention2, int i) {
        Object[] objArr = {alitaIntention, alitaIntention2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bafad4a8392a46127ecaf76724a257c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bafad4a8392a46127ecaf76724a257c");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("newIntention", alitaIntention != null ? k.a(alitaIntention.b().toString()) : null);
            hashMap.put("prevIntention", alitaIntention2 != null ? k.a(alitaIntention2.b().toString()) : null);
            com.sankuai.waimai.alita.core.utils.c.a(new b.a().a("alita_intention").c(this.c).a(b.EnumC0714b.DEBUG).b(a(i)).a(hashMap).a());
        } catch (Exception unused) {
        }
    }

    public final void a(final AlitaIntention alitaIntention) {
        Object[] objArr = {alitaIntention};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33c478efe4462ea7ddfb161847176cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33c478efe4462ea7ddfb161847176cb");
        } else if (alitaIntention == null || TextUtils.isEmpty(alitaIntention.d)) {
        } else {
            synchronized (this) {
                final AlitaIntention put = this.b.put(alitaIntention.d, alitaIntention);
                com.sankuai.waimai.launcher.util.aop.b.a(d, new Runnable() { // from class: com.sankuai.waimai.alita.core.intention.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.sankuai.waimai.alita.core.event.a aVar;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31d906c5cceb14f173d4a6fad6e29e36", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31d906c5cceb14f173d4a6fad6e29e36");
                            return;
                        }
                        a aVar2 = a.this;
                        AlitaIntention alitaIntention2 = alitaIntention;
                        AlitaIntention alitaIntention3 = put;
                        AlitaIntention alitaIntention4 = alitaIntention;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = AlitaIntention.a;
                        if (PatchProxy.isSupport(objArr3, alitaIntention4, changeQuickRedirect3, false, "af1bdc3d2c7a1378a910fb9c98ba0f90", RobustBitConfig.DEFAULT_VALUE)) {
                            aVar = (com.sankuai.waimai.alita.core.event.a) PatchProxy.accessDispatch(objArr3, alitaIntention4, changeQuickRedirect3, false, "af1bdc3d2c7a1378a910fb9c98ba0f90");
                        } else {
                            aVar = new com.sankuai.waimai.alita.core.event.a();
                            aVar.b = "intention_update";
                            String str = alitaIntention4.e;
                            if (TextUtils.isEmpty(str)) {
                                str = alitaIntention4.d;
                            }
                            aVar.d = str;
                            aVar.e = alitaIntention4.d;
                            aVar.c = alitaIntention4.j;
                            HashMap hashMap = new HashMap();
                            hashMap.put("name", alitaIntention4.d);
                            hashMap.put("scene_key", alitaIntention4.e);
                            hashMap.put("scene_id", Integer.valueOf(alitaIntention4.f));
                            hashMap.put("intention_id", Integer.valueOf(alitaIntention4.g));
                            alitaIntention4.a(hashMap, "exp_group_info", alitaIntention4.i);
                            alitaIntention4.a(hashMap, "exp_param", alitaIntention4.h);
                            hashMap.put("biz", alitaIntention4.j);
                            hashMap.put("type", Integer.valueOf(alitaIntention4.k));
                            hashMap.put("version", Integer.valueOf(alitaIntention4.l));
                            hashMap.put("score", Float.valueOf(alitaIntention4.m));
                            hashMap.put("source", Integer.valueOf(alitaIntention4.n));
                            hashMap.put("session_id", alitaIntention4.p);
                            hashMap.put(AtMeInfo.TIME_STAMP, Long.valueOf(aVar.f()));
                            if (alitaIntention4.o != null && alitaIntention4.o.size() > 0) {
                                hashMap.put("clear_opportunity", TextUtils.join(AlitaIntention.b, alitaIntention4.o));
                            } else {
                                hashMap.put("clear_opportunity", "");
                            }
                            alitaIntention4.a(hashMap, "info", alitaIntention4.a());
                            aVar.f = hashMap;
                        }
                        aVar2.a(1, alitaIntention2, alitaIntention3, aVar);
                    }
                });
            }
            AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.Intention.UPDATE, com.sankuai.waimai.alita.platform.utils.b.b(), this.c).addTags("name", alitaIntention.d).addTags("type", String.valueOf(alitaIntention.k)).addTags("source", String.valueOf(alitaIntention.n)).addTags(AlitaMonitorCenter.AlitaMonitorConst.Intention.TAG_KEY_VERSION, String.valueOf(alitaIntention.l)).commit();
        }
    }
}
