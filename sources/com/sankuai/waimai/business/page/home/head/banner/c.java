package com.sankuai.waimai.business.page.home.head.banner;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.model.API;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.ad.Ad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    a b;
    Object c;
    boolean d;
    boolean e;
    k f;
    k g;
    Context h;
    private int i;
    private List<Integer> j;
    private List<Long> k;

    public static /* synthetic */ int a(c cVar) {
        int i = cVar.i;
        cVar.i = i + 1;
        return i;
    }

    public static /* synthetic */ List a(c cVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "dcf07c93e15b95b3465baba14df64b26", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "dcf07c93e15b95b3465baba14df64b26");
        }
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Ad ad = (Ad) it.next();
                if (cVar.b.a(ad)) {
                    arrayList.add(ad);
                }
            }
        }
        return arrayList;
    }

    public c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4868a5c5ddfab2ba42789148ffb0b44f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4868a5c5ddfab2ba42789148ffb0b44f");
            return;
        }
        this.c = new Object();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.b = aVar;
        this.h = aVar.m();
        b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9780203012f182ec07161a8b936b56e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9780203012f182ec07161a8b936b56e");
        } else {
            this.f = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(HomePageFragment.d.class).e().b(rx.schedulers.a.d()).a(rx.android.schedulers.a.a()).c(new rx.functions.b<HomePageFragment.d>() { // from class: com.sankuai.waimai.business.page.home.head.banner.c.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(HomePageFragment.d dVar) {
                    HomePageFragment.d dVar2 = dVar;
                    Object[] objArr3 = {dVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a75dba2725e3fed456e297677dde004c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a75dba2725e3fed456e297677dde004c");
                    } else if (dVar2.a == 2) {
                        c.this.e = true;
                        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(c.this.c);
                    } else {
                        c.this.e = false;
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "28b6d81cca2b7ef9d6e4299b935a4f42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "28b6d81cca2b7ef9d6e4299b935a4f42");
        } else {
            this.g = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(HomePageFragment.h.class).e().b(rx.schedulers.a.d()).a(rx.android.schedulers.a.a()).c(new rx.functions.b<HomePageFragment.h>() { // from class: com.sankuai.waimai.business.page.home.head.banner.c.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(HomePageFragment.h hVar) {
                    Object[] objArr4 = {hVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "26a72302aa0192ce4a907cb6f4186943", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "26a72302aa0192ce4a907cb6f4186943");
                        return;
                    }
                    c cVar = c.this;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                    if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "816879f15316b8f25ee0be83d84406c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "816879f15316b8f25ee0be83d84406c1");
                    } else {
                        cVar.a();
                    }
                }
            });
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "443ea06ad47bd5d9178451f202842a8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "443ea06ad47bd5d9178451f202842a8b");
            return;
        }
        this.j.clear();
        this.k.clear();
        a(this.b.w);
    }

    private void c() {
        String join;
        String join2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ede08e9da9013948b359bb249d5fe72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ede08e9da9013948b359bb249d5fe72");
            return;
        }
        com.sankuai.waimai.platform.mach.monitor.b.a().c();
        com.sankuai.waimai.platform.mach.monitor.d.a("home/rcmdboard", "homepage");
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.c);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        API api = (API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5eaad15477ebac3fa8c5531ca645f82f", RobustBitConfig.DEFAULT_VALUE)) {
            join = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5eaad15477ebac3fa8c5531ca645f82f");
        } else {
            join = TextUtils.join(CommonConstant.Symbol.COMMA, this.k);
            if (TextUtils.isEmpty(join)) {
                join = "";
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dcb62023a3e30971f96b1a7b36841c0f", RobustBitConfig.DEFAULT_VALUE)) {
            join2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dcb62023a3e30971f96b1a7b36841c0f");
        } else {
            join2 = TextUtils.join(CommonConstant.Symbol.COMMA, this.j);
            if (TextUtils.isEmpty(join2)) {
                join2 = "";
            }
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(api.getTopBanner(join, join2, ""), new b.AbstractC1042b<BaseResponse<List<Ad>>>() { // from class: com.sankuai.waimai.business.page.home.head.banner.c.3
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                List<Ad> list;
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr4 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c213a6cedee3c8fdff82c716377ef7d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c213a6cedee3c8fdff82c716377ef7d6");
                    return;
                }
                c.a(c.this);
                if (baseResponse != null && baseResponse.code == 0) {
                    List list2 = (List) baseResponse.data;
                    if (!com.sankuai.waimai.foundation.utils.b.b(list2)) {
                        List a2 = c.a(c.this, list2);
                        if (com.sankuai.waimai.foundation.utils.b.b(a2)) {
                            c.this.d = false;
                            return;
                        }
                        c.this.d = true;
                        if (SystemClock.elapsedRealtime() - elapsedRealtime > 4000) {
                            return;
                        }
                        List<Ad> subList = a2.subList(0, Math.min(a2.size(), com.sankuai.waimai.foundation.utils.b.c(c.a(c.this, c.this.b.w))));
                        c cVar = c.this;
                        Object[] objArr5 = {subList};
                        ChangeQuickRedirect changeQuickRedirect5 = c.a;
                        if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "f9b6d8dd91ec1ece4f72bcf8517ad86f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "f9b6d8dd91ec1ece4f72bcf8517ad86f");
                        } else if (!com.sankuai.waimai.foundation.utils.b.b(subList)) {
                            for (Ad ad : subList) {
                                ad.setIsSelfRefreshAd(true);
                            }
                        }
                        c.this.a(subList);
                        c cVar2 = c.this;
                        Object[] objArr6 = {subList};
                        ChangeQuickRedirect changeQuickRedirect6 = c.a;
                        if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "643a54528eff1dd832b3c48d5b1d7fca", RobustBitConfig.DEFAULT_VALUE)) {
                            list = (List) PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "643a54528eff1dd832b3c48d5b1d7fca");
                        } else {
                            List<Ad> list3 = cVar2.b.w;
                            if (com.sankuai.waimai.foundation.utils.b.b(subList)) {
                                list = list3;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (Ad ad2 : list3) {
                                    if (cVar2.b.a(ad2) && !com.sankuai.waimai.foundation.utils.b.b(subList)) {
                                        arrayList.add(subList.remove(0));
                                    } else {
                                        arrayList.add(ad2);
                                    }
                                }
                                list = arrayList;
                            }
                        }
                        c.this.b.a(new ArrayList<>(list), true);
                        return;
                    }
                }
                c.this.d = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b
            public BaseResponse<List<Ad>> a(BaseResponse<List<Ad>> baseResponse) {
                Ad.b bVar;
                Object[] objArr4 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "81ac17145c914dc11d6f88b7139c9ec7", RobustBitConfig.DEFAULT_VALUE)) {
                    return (BaseResponse) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "81ac17145c914dc11d6f88b7139c9ec7");
                }
                if (baseResponse != null && !com.sankuai.waimai.foundation.utils.b.b(baseResponse.data)) {
                    Gson gson = new Gson();
                    for (Ad ad : baseResponse.data) {
                        String showContentStr = ad.getShowContentStr();
                        if (!TextUtils.isEmpty(showContentStr)) {
                            try {
                                bVar = (Ad.b) gson.fromJson(showContentStr, (Class<Object>) Ad.b.class);
                            } catch (Exception unused) {
                                bVar = null;
                            }
                            if (bVar != null) {
                                bVar.d = bVar.toString();
                            }
                            ad.setAdShowContent(bVar);
                        }
                    }
                }
                return baseResponse;
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr4 = {th};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0192ee6d29e43be92e419a157938b618", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0192ee6d29e43be92e419a157938b618");
                    return;
                }
                c.a(c.this);
                c.this.d = false;
            }
        }, this.c);
    }

    void a(List<Ad> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c2af8ec57f6f48730048efeec3f5c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c2af8ec57f6f48730048efeec3f5c6");
        } else if (!com.sankuai.waimai.foundation.utils.b.b(list)) {
            for (Ad ad : list) {
                if (this.b.a(ad) && ad.getAdExtra() != null) {
                    if (this.b.b(ad)) {
                        try {
                            JSONObject jSONObject = new JSONObject(ad.templateJson);
                            long optLong = jSONObject.optLong("poiId");
                            int optInt = jSONObject.optInt("activityId");
                            this.k.add(Long.valueOf(optLong));
                            this.j.add(Integer.valueOf(optInt));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    } else {
                        this.k.add(Long.valueOf(ad.getAdExtra().f));
                        this.j.add(Integer.valueOf(ad.getActivityId()));
                    }
                }
            }
        }
    }

    private boolean d() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d7ea9214cb394cd0a4772a2564333bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d7ea9214cb394cd0a4772a2564333bf")).booleanValue();
        }
        if (this.i < 3 && ((this.i == 0 || this.d) && !this.e)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcdef95a12c1b09e47e9e3f9ba35cb3a", RobustBitConfig.DEFAULT_VALUE)) {
                Iterator<Ad> it = this.b.w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (this.b.a(it.next())) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcdef95a12c1b09e47e9e3f9ba35cb3a")).booleanValue();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "136e33708707ff789e61f39b15465562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "136e33708707ff789e61f39b15465562");
        } else if (z) {
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af5b1b0c1ea4c0418476a054ebb17983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af5b1b0c1ea4c0418476a054ebb17983");
        } else if (d()) {
            this.b.P();
            c();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f9396cb881e15bd83411898facbc755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f9396cb881e15bd83411898facbc755");
            return;
        }
        this.i = 0;
        this.d = false;
        b();
    }
}
