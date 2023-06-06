package com.sankuai.waimai.business.page.home.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.cache.d;
import com.sankuai.waimai.business.page.home.model.h;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.router.method.Func1;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ResourceHelper implements Func1<String, Drawable> {
    private static final String[] SP_KEYS = {"tab_poi_normal", "tab_poi_selected", "tab_order_normal", "tab_order_selected", "tab_user_normal", "tab_user_selected", "btn_shopping_cart_normal", "btn_shopping_cart_disabled", "bg_bottom_tab", "banner_buttom_pic", "area_bottom_picture", "banner_bottom_video", "block_area_title_picture"};
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context mContext;

    public ResourceHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1708c6456a097435eda347454b17544d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1708c6456a097435eda347454b17544d");
        } else {
            this.mContext = context;
        }
    }

    public List<h> getResourceList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0566665db42a9a20691aa03015e92091", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0566665db42a9a20691aa03015e92091");
        }
        ArrayList arrayList = new ArrayList();
        for (String str : SP_KEYS) {
            h resource = getResource(str);
            if (resource != null) {
                arrayList.add(resource);
            }
        }
        return arrayList;
    }

    public void setResourceList(List<h> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1188e6a0787de1e3552ccad828feec92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1188e6a0787de1e3552ccad828feec92");
        } else if (list != null && !list.isEmpty()) {
            for (h hVar : list) {
                setResource(hVar);
            }
        }
    }

    public h getResource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b0de9d5694074dc747f9699c098ea47", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b0de9d5694074dc747f9699c098ea47") : convertJsonToObj(com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.mContext, str, ""));
    }

    private void setResource(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc4396e46fcc55c2ec20365f27941c05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc4396e46fcc55c2ec20365f27941c05");
            return;
        }
        if (hVar != null && !hVar.b()) {
            hVar.g = ImageQualityUtil.a(this.mContext, hVar.g, 2);
        }
        String convertObjToJson = convertObjToJson(hVar);
        if (TextUtils.isEmpty(convertObjToJson)) {
            return;
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.mContext, hVar.f, convertObjToJson);
    }

    private h getShowResource(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d39c1f844da042ccad206a4dfa8a954", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d39c1f844da042ccad206a4dfa8a954");
        }
        h resource = getResource(str);
        if (isResourceValid(resource) && hasCache(resource)) {
            return resource;
        }
        return null;
    }

    private boolean isResourceValid(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d1e801ae3cd0b356cd4415c39308a1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d1e801ae3cd0b356cd4415c39308a1e")).booleanValue();
        }
        if (hVar == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        return currentTimeMillis > ((long) hVar.h) && (currentTimeMillis < ((long) hVar.i) || hVar.i < 0);
    }

    private boolean hasCache(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e4ad63d2f08fd59f3c0eb228e0b418e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e4ad63d2f08fd59f3c0eb228e0b418e")).booleanValue();
        }
        if (hVar == null) {
            return false;
        }
        com.sankuai.waimai.business.page.home.cache.c cVar = new com.sankuai.waimai.business.page.home.cache.c(this.mContext);
        cVar.a(hVar.g);
        return cVar.c();
    }

    private Bitmap getResourceBitmap(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "538796a5782f22cfd699f963ff6a5f5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "538796a5782f22cfd699f963ff6a5f5a");
        }
        com.sankuai.waimai.business.page.home.cache.c cVar = new com.sankuai.waimai.business.page.home.cache.c(this.mContext);
        cVar.a(hVar.g);
        if (cVar.c()) {
            try {
                InputStream a = cVar.a();
                Bitmap a2 = com.sankuai.waimai.platform.utils.e.a(a, g.a(this.mContext), g.b(this.mContext), Bitmap.Config.RGB_565);
                if (a2 == null) {
                    a.AbstractC1040a b = new com.sankuai.waimai.business.page.common.log.a().a("home_page_resource_show").b("decode_error");
                    i.d(b.c(hVar.f + "#" + hVar.g + "#").b());
                }
                a.close();
                return a2;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public Drawable getShowDrawable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22c480d7a09cc3a3777d88ebdbb5b1b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22c480d7a09cc3a3777d88ebdbb5b1b8");
        }
        h showResource = getShowResource(str);
        if (showResource == null) {
            return null;
        }
        return new BitmapDrawable(this.mContext.getResources(), getResourceBitmap(showResource));
    }

    public Bitmap getShowBitmap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b90ac4cae7ac26506e502711c8a467f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b90ac4cae7ac26506e502711c8a467f6");
        }
        h showResource = getShowResource(str);
        if (showResource == null) {
            return null;
        }
        return getResourceBitmap(showResource);
    }

    public String getBannerBottomVideoPath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab1b4d935ab71a6b1869eed1eecde050", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab1b4d935ab71a6b1869eed1eecde050") : getShowVideoPath("banner_bottom_video");
    }

    private String getShowVideoPath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa8ea4af1f3dd77b68180e14be1d8ce3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa8ea4af1f3dd77b68180e14be1d8ce3");
        }
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.mContext, str, "");
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        h convertJsonToObj = convertJsonToObj(b);
        com.sankuai.waimai.business.page.home.cache.c cVar = new com.sankuai.waimai.business.page.home.cache.c(this.mContext);
        cVar.d = convertJsonToObj.g;
        return cVar.b();
    }

    public void clearResource(String str) {
        h resource;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3d15aac6d29b3e98ddd73169b021239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3d15aac6d29b3e98ddd73169b021239");
        } else if (com.sankuai.waimai.foundation.core.a.b() && (resource = getResource(str)) != null) {
            com.sankuai.waimai.business.page.home.cache.c cVar = new com.sankuai.waimai.business.page.home.cache.c(this.mContext);
            cVar.d = resource.g;
            cVar.d();
        }
    }

    public void clearAllResource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20efb982bae786dd07ff7dc82ec76686", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20efb982bae786dd07ff7dc82ec76686");
        } else if (com.sankuai.waimai.foundation.core.a.b()) {
            l.a(new l.a() { // from class: com.sankuai.waimai.business.page.home.helper.ResourceHelper.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "774944563ffe48608c9cdfa764888937", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "774944563ffe48608c9cdfa764888937");
                        return;
                    }
                    for (String str : ResourceHelper.SP_KEYS) {
                        h resource = ResourceHelper.this.getResource(str);
                        if (resource != null) {
                            com.sankuai.waimai.business.page.home.cache.c cVar = new com.sankuai.waimai.business.page.home.cache.c(ResourceHelper.this.mContext);
                            cVar.d = resource.g;
                            cVar.d();
                        }
                    }
                }
            }, (String) null);
        }
    }

    @WorkerThread
    public void downloadImages(List<h> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac700a4f60848590e9f11d1d9121bc4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac700a4f60848590e9f11d1d9121bc4e");
        } else if (list != null && list.size() > 0) {
            for (final h hVar : list) {
                if (!hVar.b() || p.d(this.mContext)) {
                    new com.sankuai.waimai.business.page.home.cache.d(this.mContext).a(hVar.g, new d.a() { // from class: com.sankuai.waimai.business.page.home.helper.ResourceHelper.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.home.cache.d.a
                        public final void a(String str, Throwable th) {
                            Object[] objArr2 = {str, th};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c188e648108ff6bfb369ba98eba23590", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c188e648108ff6bfb369ba98eba23590");
                                return;
                            }
                            a.AbstractC1040a b = new com.sankuai.waimai.business.page.common.log.a().a("home_page_resource_show").b("download_error");
                            i.d(b.c(hVar.f + "#" + hVar.g + "#" + th.getMessage()).b(true).b());
                        }

                        @Override // com.sankuai.waimai.business.page.home.cache.d.a
                        public final void b(String str) {
                            Object[] objArr2 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ab2e82652e13cc9bad2ab1b6176bf99", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ab2e82652e13cc9bad2ab1b6176bf99");
                                return;
                            }
                            a.AbstractC1040a b = new com.sankuai.waimai.business.page.common.log.a().a("home_page_resource_show").b("cache_error");
                            i.d(b.c(hVar.f + "#" + hVar.g).b(true).b());
                        }

                        @Override // com.sankuai.waimai.business.page.home.cache.d.a
                        public final void a(String str) {
                            Object[] objArr2 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8e50b582cadaf37378f33517717ceada", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8e50b582cadaf37378f33517717ceada");
                            } else {
                                i.c(new com.sankuai.waimai.business.page.common.log.a().a("home_page_resource_show").b());
                            }
                        }
                    });
                }
            }
        }
    }

    private String convertObjToJson(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46e9373b71fa73b449a506878b7b9a64", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46e9373b71fa73b449a506878b7b9a64");
        }
        if (hVar == null) {
            return "";
        }
        try {
            return hVar.a();
        } catch (JSONException unused) {
            return "";
        }
    }

    private h convertJsonToObj(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecab16dc2098b3d2f2d30dc8b53dd992", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecab16dc2098b3d2f2d30dc8b53dd992");
        }
        try {
            h hVar = new h();
            hVar.a(new JSONObject(str));
            return hVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public Bitmap getShowBitmapWithoutTime(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8e86c7cbcd1ac3f0cc25530900960be", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8e86c7cbcd1ac3f0cc25530900960be");
        }
        h showResourceWithoutTime = getShowResourceWithoutTime(str);
        if (showResourceWithoutTime == null) {
            return null;
        }
        return getResourceBitmap(showResourceWithoutTime);
    }

    private h getShowResourceWithoutTime(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24da0b1c80b007100dd4263c18f0b6b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24da0b1c80b007100dd4263c18f0b6b6");
        }
        h resource = getResource(str);
        if (hasCache(resource)) {
            return resource;
        }
        return null;
    }

    @Override // com.sankuai.waimai.router.method.Func1
    public Drawable call(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5e5ec8abb9d47bb5ff3c988b6a1cc10", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5e5ec8abb9d47bb5ff3c988b6a1cc10") : getShowDrawable(str);
    }
}
