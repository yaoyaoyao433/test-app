package com.sankuai.waimai.contextual.computing.storage.sp;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.contextual.computing.config.a;
import com.sankuai.waimai.contextual.computing.storage.model.c;
import com.sankuai.waimai.foundation.location.v2.d;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ContextualComputingSP {
    public static ChangeQuickRedirect a;
    private static e<ContextualComputingSPKeys> b = new e<>("waimai_contextual_computing");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public enum ContextualComputingSPKeys {
        ADDRESS_RECOMMEND_CONFIG,
        HISTORY_ADDRESS_LIST,
        ADDRESS_REPORT_VERSION,
        ADDRESS_REPORT_INFO;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static ContextualComputingSPKeys valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "79bfe79b61011da36eeac841b3f1b71b", RobustBitConfig.DEFAULT_VALUE) ? (ContextualComputingSPKeys) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "79bfe79b61011da36eeac841b3f1b71b") : (ContextualComputingSPKeys) Enum.valueOf(ContextualComputingSPKeys.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ContextualComputingSPKeys[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93d1418e3b700597b42c462579cebf30", RobustBitConfig.DEFAULT_VALUE) ? (ContextualComputingSPKeys[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93d1418e3b700597b42c462579cebf30") : (ContextualComputingSPKeys[]) values().clone();
        }

        ContextualComputingSPKeys() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af4ca9eff0e4ab8a288b58daead21357", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af4ca9eff0e4ab8a288b58daead21357");
            }
        }
    }

    public static void a(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c7af66f7c5c1409556b2af3c6bc33e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c7af66f7c5c1409556b2af3c6bc33e5");
        } else {
            b.a((e<ContextualComputingSPKeys>) ContextualComputingSPKeys.ADDRESS_RECOMMEND_CONFIG, aVar.toString());
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb9b345487984c764ffa6af231f6f96e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb9b345487984c764ffa6af231f6f96e");
        }
        String b2 = b.b((e<ContextualComputingSPKeys>) ContextualComputingSPKeys.ADDRESS_RECOMMEND_CONFIG, "");
        a a2 = TextUtils.isEmpty(b2) ? null : a.a(b2);
        if (a2 == null) {
            a aVar = new a();
            aVar.b = false;
            aVar.c = -1;
            aVar.d = 1;
            aVar.e = 3;
            aVar.f = 5;
            aVar.g = 1;
            aVar.h = 100;
            return aVar;
        }
        return a2;
    }

    public static void a(List<AddressItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0583abf9b60c98bc5fe8025f719013e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0583abf9b60c98bc5fe8025f719013e");
        } else {
            b.a((e<ContextualComputingSPKeys>) ContextualComputingSPKeys.HISTORY_ADDRESS_LIST, d.a().toJson(list));
        }
    }

    public static List<AddressItem> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e19b613ef24e8b6e80b3a2f2f92700ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e19b613ef24e8b6e80b3a2f2f92700ce");
        }
        String b2 = b.b((e<ContextualComputingSPKeys>) ContextualComputingSPKeys.HISTORY_ADDRESS_LIST, "");
        if (!TextUtils.isEmpty(b2)) {
            try {
                return (List) d.a().fromJson(b2, new TypeToken<List<AddressItem>>() { // from class: com.sankuai.waimai.contextual.computing.storage.sp.ContextualComputingSP.1
                }.getType());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void b(List<c> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acf84838d6dd7cd265442a619d846a4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acf84838d6dd7cd265442a619d846a4c");
        } else {
            b.a((e<ContextualComputingSPKeys>) ContextualComputingSPKeys.ADDRESS_REPORT_INFO, d.a().toJson(list));
        }
    }

    public static List<c> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "133f15b78d5247a3b0a527d3c221598d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "133f15b78d5247a3b0a527d3c221598d");
        }
        String b2 = b.b((e<ContextualComputingSPKeys>) ContextualComputingSPKeys.ADDRESS_REPORT_INFO, "");
        if (!TextUtils.isEmpty(b2)) {
            try {
                return (List) d.a().fromJson(b2, new TypeToken<List<c>>() { // from class: com.sankuai.waimai.contextual.computing.storage.sp.ContextualComputingSP.2
                }.getType());
            } catch (Exception unused) {
            }
        }
        return new ArrayList();
    }

    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2ad5104dafb11a8d35e2245d9593759", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2ad5104dafb11a8d35e2245d9593759") : b.b((e<ContextualComputingSPKeys>) ContextualComputingSPKeys.ADDRESS_REPORT_VERSION, "");
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd3d1db5f787a8840ccfee9f702644ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd3d1db5f787a8840ccfee9f702644ed");
        } else {
            b.a((e<ContextualComputingSPKeys>) ContextualComputingSPKeys.ADDRESS_REPORT_VERSION, str);
        }
    }
}
