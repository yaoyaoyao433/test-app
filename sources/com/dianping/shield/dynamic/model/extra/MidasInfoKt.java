package com.dianping.shield.dynamic.model.extra;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.midas.ad.feedback.b;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aB\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0080\b¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"report", "", "Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "context", "Landroid/content/Context;", SocialConstants.PARAM_ACT, "", "urlKey", "", "moduleName", "modulePosition", "(Lcom/dianping/shield/dynamic/model/extra/MidasInfo;Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class MidasInfoKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void report(@Nullable MidasInfo midasInfo, @Nullable Context context, int i, @Nullable String str, @NotNull String str2, @Nullable Integer num) {
        String[] clickURLs;
        String[] viewURLs;
        Object[] objArr = {midasInfo, context, Integer.valueOf(i), str, str2, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f689601e72d4183b3acf962069aa554a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f689601e72d4183b3acf962069aa554a");
            return;
        }
        h.b(str2, "moduleName");
        if (midasInfo == null || TextUtils.isEmpty(midasInfo.getFeedback())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1965055348) {
                if (hashCode == 1195852073 && str.equals("viewURLs") && (viewURLs = midasInfo.getViewURLs()) != null) {
                    for (String str3 : viewURLs) {
                        arrayList.add(str3);
                    }
                }
            } else if (str.equals("clickURLs") && (clickURLs = midasInfo.getClickURLs()) != null) {
                for (String str4 : clickURLs) {
                    arrayList.add(str4);
                }
            }
        }
        HashMap<String, String> extra = midasInfo.getExtra();
        if (extra == null) {
            extra = new HashMap<>();
        }
        HashMap<String, String> hashMap = extra;
        hashMap.put("adsdktype", "4");
        hashMap.put("modulename", str2);
        if (num != null) {
            hashMap.put("modulePosi", String.valueOf(num.intValue()));
        }
        if (context != null) {
            new b(context).a(midasInfo.getFeedback(), i, arrayList, midasInfo.getExtra());
        }
    }
}
