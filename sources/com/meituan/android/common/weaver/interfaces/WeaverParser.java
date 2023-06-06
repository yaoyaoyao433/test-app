package com.meituan.android.common.weaver.interfaces;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class WeaverParser {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final List<WeaverParser> sParsers = new CopyOnWriteArrayList();

    public abstract WeaverEvent fromJson(@NonNull String str, JSONObject jSONObject, long j) throws JSONException;

    @Nullable
    public static WeaverEvent parseFromJson(@NonNull String str, JSONObject jSONObject, long j) throws JSONException {
        Object[] objArr = {str, jSONObject, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd5c7c030ae4c608ec65216ea713791d", RobustBitConfig.DEFAULT_VALUE)) {
            return (WeaverEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd5c7c030ae4c608ec65216ea713791d");
        }
        for (WeaverParser weaverParser : sParsers) {
            WeaverEvent fromJson = weaverParser.fromJson(str, jSONObject, j);
            if (fromJson != null) {
                return fromJson;
            }
        }
        return null;
    }

    public static void register(@NonNull WeaverParser weaverParser) {
        Object[] objArr = {weaverParser};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2552f20fd7d084138f1ed3be47c98d80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2552f20fd7d084138f1ed3be47c98d80");
        } else {
            sParsers.add(weaverParser);
        }
    }
}
