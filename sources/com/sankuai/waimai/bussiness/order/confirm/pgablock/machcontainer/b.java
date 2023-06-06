package com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.mach.b;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect f;
    private String d;
    protected com.sankuai.waimai.bussiness.order.base.mach.b g;
    protected final Activity h;
    protected com.sankuai.waimai.bussiness.order.confirm.helper.f i;
    public Map<String, Object> j;

    @Override // com.meituan.android.cube.pga.view.a
    public int d() {
        return R.layout.wm_order_detail_mach_container_layout;
    }

    public b(Context context, String str) {
        super(context);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "567740159660d0089ed3605ac81a1c8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "567740159660d0089ed3605ac81a1c8c");
            return;
        }
        this.h = (Activity) context;
        this.d = str;
    }

    public b(Context context, String str, com.sankuai.waimai.bussiness.order.confirm.helper.f fVar) {
        super(context);
        Object[] objArr = {context, str, fVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aea2efea2647d50453822819aa36119c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aea2efea2647d50453822819aa36119c");
            return;
        }
        this.h = (Activity) context;
        this.d = str;
        this.i = fVar;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public void b() {
        String str;
        Rect rect;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f0a2b24a48384fad2094e4ac4e86d9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f0a2b24a48384fad2094e4ac4e86d9a");
            return;
        }
        a(0, g.a(this.c, 8.0f), 0, 0);
        ViewGroup viewGroup = (ViewGroup) this.b.findViewById(R.id.mach_container);
        Activity activity = (Activity) this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9724c4943400fb619fb2651151637840", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9724c4943400fb619fb2651151637840");
        } else if (this.c instanceof BaseActivity) {
            str = ((BaseActivity) this.c).w();
        } else {
            str = getClass().getSimpleName() + System.currentTimeMillis();
        }
        String str2 = str;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = f;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f893ccf55d46618c431cbe824fbb923f", RobustBitConfig.DEFAULT_VALUE)) {
            rect = (Rect) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f893ccf55d46618c431cbe824fbb923f");
        } else {
            Rect rect2 = new Rect();
            int a = g.a(this.c);
            int b = g.b(this.c);
            rect2.left = 0;
            rect2.top = g.a(this.c, 87.0f);
            rect2.right = a;
            rect2.bottom = b - g.a(this.c, 72.0f);
            rect = rect2;
        }
        this.g = new com.sankuai.waimai.bussiness.order.base.mach.b(activity, str2, "c_ykhs39e", rect);
        this.g.a(viewGroup, this.d, "waimai");
        this.g.d = new b.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.base.mach.b.a
            public final void a(@NonNull String str3, @Nullable Map<String, Object> map) {
                Object[] objArr4 = {str3, map};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "07903a2e3cc4f198529565054bca2bd4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "07903a2e3cc4f198529565054bca2bd4");
                } else {
                    b.this.a(str3, map);
                }
            }
        };
        this.g.f = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void e() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "766126134a5bdbea7961f7b427269453", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "766126134a5bdbea7961f7b427269453");
                } else {
                    super.e();
                }
            }
        };
    }

    public final void a(int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object[] objArr = {0, Integer.valueOf(i2), 0, 0};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c87b95a0239493b02e0f50353986a667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c87b95a0239493b02e0f50353986a667");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.setMargins(0, i2, 0, 0);
        this.b.setLayoutParams(marginLayoutParams);
    }

    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
        char c;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83fd4c83d5ebd4ae62feb919a4ead67c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83fd4c83d5ebd4ae62feb919a4ead67c");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1521331687) {
            if (str.equals("data_update_event")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode == -868944470) {
            if (str.equals("save_state_event")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -23099450) {
            if (hashCode == 51909156 && str.equals("router_event")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("judas_event")) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                if (map == null) {
                    return;
                }
                String valueOf = String.valueOf(map.get("stateKey"));
                if (TextUtils.isEmpty(valueOf)) {
                    return;
                }
                Object obj = map.get("stateValue");
                if (this.j == null) {
                    this.j = new HashMap();
                }
                this.j.put(valueOf, obj);
                return;
            case 1:
                if (map == null) {
                    return;
                }
                String valueOf2 = String.valueOf(map.get("url"));
                Object obj2 = map.get("extra_params");
                if (TextUtils.isEmpty(valueOf2)) {
                    return;
                }
                if (obj2 != null && (obj2 instanceof Map)) {
                    com.sankuai.waimai.foundation.router.a.a(this.h, valueOf2, (Map) obj2);
                    return;
                } else {
                    com.sankuai.waimai.foundation.router.a.a(this.c, valueOf2);
                    return;
                }
            case 2:
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = f;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1300dcd7af2a4ecfb97d4d9233bf8c8a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1300dcd7af2a4ecfb97d4d9233bf8c8a");
                    return;
                } else if (map == null || !map.containsKey("bid")) {
                    return;
                } else {
                    String valueOf3 = String.valueOf(map.get("bid"));
                    String valueOf4 = String.valueOf(map.get("cid"));
                    if (TextUtils.isEmpty(valueOf4)) {
                        valueOf4 = "c_ykhs39e";
                    }
                    int a = r.a(String.valueOf(map.get("judasType")), -1);
                    Map<String, Object> hashMap = new HashMap<>();
                    if (map.containsKey("valLab") && (map.get("valLab") instanceof Map)) {
                        hashMap = (Map) map.get("valLab");
                    }
                    if (a == 1) {
                        JudasManualManager.b(valueOf3).a(valueOf4).a(hashMap).a(this.h).a();
                        return;
                    } else if (a == 2) {
                        JudasManualManager.a(valueOf3).a(valueOf4).a(hashMap).a(this.h).a();
                        return;
                    } else {
                        return;
                    }
                }
            case 3:
                Object[] objArr3 = {map};
                ChangeQuickRedirect changeQuickRedirect3 = f;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f5d3b3d319c90cdaa0daa37a967c9c98", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f5d3b3d319c90cdaa0daa37a967c9c98");
                    return;
                }
                String.valueOf(map.get("templateId"));
                String valueOf5 = String.valueOf(map.get("action"));
                if (map.containsKey("state")) {
                    if (this.j == null) {
                        this.j = new HashMap();
                    }
                    int a2 = r.a(String.valueOf(map.get("cacheType")), 0);
                    Object obj3 = map.get("state");
                    switch (a2) {
                        case 0:
                            Object[] objArr4 = {obj3};
                            ChangeQuickRedirect changeQuickRedirect4 = f;
                            if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ae4d9a59b76231fb79f2a9a0dbdd521d", RobustBitConfig.DEFAULT_VALUE)) {
                                Map<? extends String, ? extends Object> map2 = obj3 instanceof Map ? (Map) obj3 : null;
                                if (map2 != null) {
                                    this.j.putAll(map2);
                                    break;
                                }
                            } else {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ae4d9a59b76231fb79f2a9a0dbdd521d");
                                break;
                            }
                            break;
                        case 1:
                            b(obj3);
                            break;
                        case 2:
                            d(obj3);
                            break;
                        case 3:
                            c(obj3);
                            break;
                    }
                }
                if (map.containsKey("data")) {
                    map.get("data");
                    if (map.containsKey("extra")) {
                        map.get("extra");
                    }
                    a(map.get("data"));
                    if (r.a(String.valueOf(map.get("isUpdate")), 0) == 1) {
                        if (!TextUtils.equals(valueOf5, "clickDeliveryTabAction")) {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = f;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d66b2d013d64e33fb9225e544e31d8f4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d66b2d013d64e33fb9225e544e31d8f4");
                                return;
                            } else {
                                this.i.a(0);
                                return;
                            }
                        }
                        Object[] objArr6 = {map};
                        ChangeQuickRedirect changeQuickRedirect6 = f;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4921fac8bbc6eb26f5b789bba79bc85d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4921fac8bbc6eb26f5b789bba79bc85d");
                            return;
                        } else if (map.containsKey("state")) {
                            Object obj4 = map.get("state");
                            Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
                            if (map3 != null) {
                                this.i.a(r.a(String.valueOf(map3.get("business_type")), 0), Boolean.parseBoolean(String.valueOf(map3.get("postPhoneAddr"))));
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0e2fb67acec3751faac4c2fbd619c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0e2fb67acec3751faac4c2fbd619c8");
            return;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, str, map.get(str));
        }
    }

    private void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb9a3f9ee3fc6fb674dbab1af51c205f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb9a3f9ee3fc6fb674dbab1af51c205f");
            return;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(this.i.aH_(), (String) entry.getKey(), entry.getValue());
        }
    }

    private void c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e825d743a0f41b70b9a7ebe751cd4b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e825d743a0f41b70b9a7ebe751cd4b1");
            return;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            com.sankuai.waimai.bussiness.order.confirm.cache.b.a().b(this.i.aH_(), (String) entry.getKey());
        }
    }

    private void d(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "303b2289c39758cb7c0b3aa78328fa1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "303b2289c39758cb7c0b3aa78328fa1b");
            return;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null || "".equals(value)) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.c, str, (String) null);
            } else if (value instanceof Boolean) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.c, str, ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.c, str, (String) value);
            } else if (value instanceof Integer) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.c, str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.c, str, ((Long) value).longValue());
            }
        }
    }

    public void a(final c cVar) {
        boolean z = true;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b2324491b2331a762c7d35d4b0cc7c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b2324491b2331a762c7d35d4b0cc7c1");
            return;
        }
        if (cVar != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9a8d3568c8095b47dc94e2813d3869bf", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9a8d3568c8095b47dc94e2813d3869bf")).booleanValue();
            } else if (TextUtils.isEmpty(cVar.b) || (TextUtils.isEmpty(cVar.e) && (cVar.g == null || cVar.g.isEmpty()))) {
                z = false;
            }
            if (z) {
                this.b.setVisibility(0);
                final Map<String, Object> map = cVar.g;
                if (map == null || map.isEmpty()) {
                    map = com.sankuai.waimai.mach.utils.b.a(cVar.e);
                }
                map.put("machState", this.j);
                if (cVar.i > 0) {
                    this.b.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.b.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ecae474313d92c9eae41a29b9b793852", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ecae474313d92c9eae41a29b9b793852");
                            } else {
                                b.this.g.a(cVar.b, cVar.c, map, cVar.h);
                            }
                        }
                    }, cVar.i);
                    return;
                } else {
                    this.g.a(cVar.b, cVar.c, map, cVar.h);
                    return;
                }
            }
        }
        this.b.setVisibility(8);
    }
}
