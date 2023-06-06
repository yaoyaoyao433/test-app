package com.sankuai.android.favorite.rx.config;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.content.MTModernAsyncTask;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.favorite.rx.request.TokenAsyncTask;
import com.sankuai.android.favorite.rx.retrofit.BaseApiRetrofitService;
import com.sankuai.meituan.model.dao.DealDao;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.meituan.skyeye.library.core.e;
import com.sankuai.model.AccountProvider;
import com.sankuai.model.CollectionUtils;
import com.sankuai.model.utils.Strings;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.client.HttpResponseException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class FavoriteController {
    public static ChangeQuickRedirect a;
    public static final Type b;
    public static final Type c;
    private static final Map<String, String> d;
    private String e;
    private File f;
    private File g;
    private Context h;
    private UserCenter i;
    private final Gson j;
    private b k;
    private AccountProvider l;
    private int m;
    private final String[] n;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FavoriteType {
    }

    static {
        HashMap hashMap = new HashMap(16);
        d = hashMap;
        hashMap.put("poi", "10");
        d.put("poi_waimai", "11");
        d.put(DealDao.TABLENAME, "20");
        d.put("deal_haiwai", "21");
        d.put("article", "30");
        d.put("dianping_toutiao", "37");
        d.put("dianping_biji", "38");
        d.put("dianping_pingjia", "39");
        b = new TypeToken<List<com.sankuai.android.favorite.rx.model.c>>() { // from class: com.sankuai.android.favorite.rx.config.FavoriteController.1
        }.getType();
        c = new TypeToken<List<Object>>() { // from class: com.sankuai.android.favorite.rx.config.FavoriteController.2
        }.getType();
    }

    @Deprecated
    public final void a() {
        Call<com.sankuai.android.favorite.rx.model.a> addFavorite;
        char c2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8012b1e103ef69aa87d178a62f630047", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8012b1e103ef69aa87d178a62f630047");
        } else if (com.sankuai.android.favorite.rx.util.b.a(this.h) && this.i.isLogin()) {
            try {
                long j = this.i.getUser().id;
                String str = this.i.getUser().token;
                String a2 = com.sankuai.android.favorite.rx.util.a.a(this.f);
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                List<com.sankuai.android.favorite.rx.model.c> list = (List) this.j.fromJson(a2, b);
                HashMap hashMap = new HashMap(16);
                Set<String> keySet = d.keySet();
                for (String str2 : keySet) {
                    hashMap.put(str2, new ArrayList());
                }
                for (com.sankuai.android.favorite.rx.model.c cVar : list) {
                    List list2 = (List) hashMap.get(cVar.b);
                    if (list2 != null) {
                        list2.add(String.valueOf(cVar.a));
                    }
                }
                for (String str3 : keySet) {
                    final List list3 = (List) hashMap.get(str3);
                    if (!CollectionUtils.isEmpty(list3)) {
                        final String a3 = a(str3);
                        com.sankuai.android.favorite.rx.retrofit.a a4 = com.sankuai.android.favorite.rx.retrofit.a.a(this.h);
                        long a5 = this.k.a();
                        String[] strArr = (String[]) list3.toArray(this.n);
                        Object[] objArr2 = new Object[5];
                        objArr2[c2] = new Long(j);
                        objArr2[1] = str;
                        objArr2[2] = new Long(a5);
                        objArr2[3] = a3;
                        objArr2[4] = strArr;
                        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.favorite.rx.retrofit.a.a;
                        if (PatchProxy.isSupport(objArr2, a4, changeQuickRedirect2, false, "8f1bbf6c4ad881c2df14dd37bc526869", RobustBitConfig.DEFAULT_VALUE)) {
                            addFavorite = (Call) PatchProxy.accessDispatch(objArr2, a4, changeQuickRedirect2, false, "8f1bbf6c4ad881c2df14dd37bc526869");
                            c2 = 0;
                        } else {
                            c2 = 0;
                            addFavorite = ((BaseApiRetrofitService) a4.b.a(BaseApiRetrofitService.class)).addFavorite(j, str, a5, a3, a4.a(strArr));
                        }
                        addFavorite.a(new f<com.sankuai.android.favorite.rx.model.a>() { // from class: com.sankuai.android.favorite.rx.config.FavoriteController.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.retrofit2.f
                            public final void onResponse(Call<com.sankuai.android.favorite.rx.model.a> call, Response<com.sankuai.android.favorite.rx.model.a> response) {
                                Object[] objArr3 = {call, response};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6c315b37777cdadd98db3fd262e4f559", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6c315b37777cdadd98db3fd262e4f559");
                                } else if (response != null && response.e() != null && response.e().a == 1 && response.e().b == null) {
                                    e.a("biz_favorite", "favorite_add", "favorite_add_success", null);
                                } else {
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("type_ids", com.sankuai.android.favorite.rx.util.a.a(a3, (String[]) list3.toArray(FavoriteController.this.n)));
                                    if (response != null && response.e() != null) {
                                        hashMap2.put("error_json", new Gson().toJson(response.e()));
                                    } else {
                                        HashMap hashMap3 = new HashMap();
                                        hashMap3.put("code", "-1");
                                        hashMap3.put("message", "");
                                        hashMap3.put("type", "");
                                        hashMap2.put("error_json", hashMap3.toString());
                                    }
                                    e.a("biz_favorite", "favorite_add", "favorite_add_fail", "添加收藏失败", hashMap2);
                                }
                            }

                            @Override // com.sankuai.meituan.retrofit2.f
                            public final void onFailure(Call<com.sankuai.android.favorite.rx.model.a> call, Throwable th) {
                                Object[] objArr3 = {call, th};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69cf2920c9736859f79a8e978aa5eba9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69cf2920c9736859f79a8e978aa5eba9");
                                    return;
                                }
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("type_ids", com.sankuai.android.favorite.rx.util.a.a(a3, (String[]) list3.toArray(FavoriteController.this.n)));
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("code", "-1");
                                hashMap3.put("message", th.getMessage());
                                hashMap3.put("type", "");
                                hashMap2.put("error_json", th != null ? hashMap3.toString() : "");
                                e.a("biz_favorite", "favorite_add", "favorite_add_fail_other", "添加收藏失败", hashMap2);
                            }
                        });
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final a a(String str, long... jArr) {
        String str2;
        Object[] objArr = {str, jArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66efec7b1ec8c90413c0c393d23f474a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66efec7b1ec8c90413c0c393d23f474a");
        }
        if (TextUtils.isEmpty(str) || jArr.length <= 0) {
            return new a(false, this.h.getText(R.string.favorite_delete_data_error).toString());
        }
        if (com.sankuai.android.favorite.rx.util.b.a(this.h)) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "869da933d1b3655027441e49008979c6", RobustBitConfig.DEFAULT_VALUE)) {
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1796265021:
                        if (str.equals("waimai_type")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1349832915:
                        if (str.equals("deal_type")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -394255133:
                        if (str.equals("article_type")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -363564246:
                        if (str.equals("haiwai_type")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 452293647:
                        if (str.equals("poi_type")) {
                            c2 = 0;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        str2 = "poi";
                        break;
                    case 1:
                        str2 = "poi_waimai";
                        break;
                    case 2:
                        str2 = DealDao.TABLENAME;
                        break;
                    case 3:
                        str2 = "deal_haiwai";
                        break;
                    case 4:
                        str2 = "article";
                        break;
                    default:
                        str2 = str;
                        break;
                }
            } else {
                str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "869da933d1b3655027441e49008979c6");
            }
            String str3 = str2;
            String a2 = a(str3);
            if (TextUtils.isEmpty(a2)) {
                return new a(false, this.h.getText(R.string.favorite_delete_failure).toString());
            }
            String[] strArr = new String[jArr.length];
            for (int i = 0; i < jArr.length; i++) {
                strArr[i] = jArr[i] + CommonConstant.Symbol.UNDERLINE + a2;
            }
            String str4 = this.e;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            this.g = new File(str4, PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ca172150859b2451a9ae53430bee59a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ca172150859b2451a9ae53430bee59a") : Strings.md5(this.l.getUserId() + "-favorite-id"));
            try {
                File file = this.f;
                File file2 = this.g;
                Object[] objArr4 = {file, file2, str3, jArr};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "96b71bb01ac428f794bf6bc2d294157e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "96b71bb01ac428f794bf6bc2d294157e");
                } else {
                    this.m = 0;
                    if (!a(file, str3, jArr) && this.i.isLogin()) {
                        a(file2, str3, jArr);
                    }
                }
                return a(strArr);
            } catch (Exception unused) {
                return new a(false, this.h.getText(R.string.favorite_delete_failure).toString());
            }
        }
        return new a(false, this.h.getText(R.string.favorite_delete_failure).toString());
    }

    private a a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9376ded35c865bfdd8284231259d23b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9376ded35c865bfdd8284231259d23b");
        }
        if (this.i.isLogin()) {
            try {
                long j = this.i.getUser().id;
                String str = this.i.getUser().token;
                com.sankuai.android.favorite.rx.retrofit.a a2 = com.sankuai.android.favorite.rx.retrofit.a.a(this.h);
                Object[] objArr2 = {new Long(j), str, strArr};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.favorite.rx.retrofit.a.a;
                Response<com.sankuai.android.favorite.rx.model.a> a3 = (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "54045a2b534f9bd573a0bdfd8325ad7e", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "54045a2b534f9bd573a0bdfd8325ad7e") : ((BaseApiRetrofitService) a2.b.a(BaseApiRetrofitService.class)).deleteFavorite(j, str, a2.a(strArr))).a();
                if (a3 != null && a3.e() != null && a3.e().a == 1) {
                    e.a("biz_favorite", "favorite_cancel", "favorite_cancel_success", null);
                    return new a(true, null);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("ids_type", com.sankuai.android.favorite.rx.util.a.a(strArr));
                if (a3 != null && a3.e() != null) {
                    hashMap.put("error_json", new Gson().toJson(a3.e()));
                    e.a("biz_favorite", "favorite_cancel", "favorite_cancel_fail", "取消收藏失败", hashMap);
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("code", "-1");
                    hashMap2.put("message", "");
                    hashMap2.put("type", "");
                    hashMap.put("error_json", hashMap2.toString());
                    e.a("biz_favorite", "favorite_cancel", "favorite_cancel_fail_other", "取消收藏失败", hashMap);
                }
                return new a(false, this.h.getText(R.string.favorite_delete_failure).toString());
            } catch (HttpResponseException e) {
                return new a(false, e.getMessage());
            } catch (Exception unused) {
            }
        }
        return new a(true, null);
    }

    private boolean a(File file, String str, long... jArr) throws Exception {
        Object[] objArr = {file, str, jArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17097754c0dd7011c6a2bce53b3263d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17097754c0dd7011c6a2bce53b3263d8")).booleanValue();
        }
        String a2 = com.sankuai.android.favorite.rx.util.a.a(file);
        if (!TextUtils.isEmpty(a2)) {
            List list = (List) this.j.fromJson(a2, b);
            for (long j : jArr) {
                String valueOf = String.valueOf(j);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.sankuai.android.favorite.rx.model.c cVar = (com.sankuai.android.favorite.rx.model.c) it.next();
                    if (TextUtils.equals(cVar.b, str) && TextUtils.equals(String.valueOf(cVar.a), valueOf)) {
                        it.remove();
                        this.m++;
                        if (this.m == jArr.length) {
                            com.sankuai.android.favorite.rx.util.a.a(file, this.j.toJson(list, b));
                            return true;
                        }
                    }
                }
            }
            com.sankuai.android.favorite.rx.util.a.a(file, this.j.toJson(list, b));
        }
        return false;
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "409cc67b2c2fb8d8a7b2c1ee7071411a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "409cc67b2c2fb8d8a7b2c1ee7071411a") : d.get(str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class SyncFavoriteAsyncTask extends MTModernAsyncTask<Void, Void, Void> {
        public static ChangeQuickRedirect a;
        private FavoriteController b;

        @Override // android.support.v4.content.ModernAsyncTask
        public /* synthetic */ Object doInBackground(Object[] objArr) {
            Object[] objArr2 = {(Void[]) objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "d0be86c68b5fd0f5267e2930fb92af6a", RobustBitConfig.DEFAULT_VALUE)) {
                return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "d0be86c68b5fd0f5267e2930fb92af6a");
            }
            this.b.a();
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class DelFavoriteTask extends TokenAsyncTask<a> {
        public static ChangeQuickRedirect a;
        private long[] e;
        private String f;
        private FavoriteController g;
        private c h;

        @Override // com.sankuai.android.spawn.task.AbstractModelAsyncTask
        public final /* synthetic */ Object a() throws Exception {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fdfcac1b404da2e7cfec7b3599ef86d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fdfcac1b404da2e7cfec7b3599ef86d") : this.g.a(this.f, this.e);
        }

        @Override // com.sankuai.android.spawn.task.AbstractModelAsyncTask
        public final /* synthetic */ void a(Object obj) {
            a aVar = (a) obj;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618dd49ebd28866fbc20568dcd5be134", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618dd49ebd28866fbc20568dcd5be134");
                return;
            }
            super.a((DelFavoriteTask) aVar);
            if (aVar != null && aVar.a) {
                if (this.h != null) {
                }
            } else if (this.h != null) {
                new a(false, aVar != null ? aVar.b : "");
            }
        }

        @Override // com.sankuai.android.spawn.task.AbstractModelAsyncTask
        public final void a(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e1c234ddfae6f2deaa2a82a54344242", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e1c234ddfae6f2deaa2a82a54344242");
                return;
            }
            super.a(exc);
            if (exc == null || this.h == null) {
                return;
            }
            new a(false, exc.getMessage());
        }
    }
}
