package com.meituan.android.common.weaver.impl.ffp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.android.common.weaver.interfaces.WeaverParser;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.android.common.weaver.interfaces.ffp.WithActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CustomTagsEventWithActivity extends CustomTagsEvent implements WithActivity {
    private static final String TYPE_BASE = "ct:wa";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String activity;

    @Override // com.meituan.android.common.weaver.impl.ffp.CustomTagsEvent, com.meituan.android.common.weaver.interfaces.WeaverEvent
    @NonNull
    public String getType() {
        return TYPE_BASE;
    }

    static {
        WeaverParser.register(new WeaverParser() { // from class: com.meituan.android.common.weaver.impl.ffp.CustomTagsEventWithActivity.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.weaver.interfaces.WeaverParser
            public final WeaverEvent fromJson(@NonNull String str, JSONObject jSONObject, long j) throws JSONException {
                Object[] objArr = {str, jSONObject, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54a25b0cccdf1c66087c5b2720d61130", RobustBitConfig.DEFAULT_VALUE)) {
                    return (WeaverEvent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54a25b0cccdf1c66087c5b2720d61130");
                }
                if (str.startsWith(CustomTagsEventWithActivity.TYPE_BASE)) {
                    CustomTagsEventWithActivity customTagsEventWithActivity = new CustomTagsEventWithActivity();
                    customTagsEventWithActivity.fromJson(str, jSONObject, j);
                    return customTagsEventWithActivity;
                }
                return null;
            }
        });
    }

    public CustomTagsEventWithActivity(@Nullable String str, @NonNull Activity activity) {
        super(str);
        Object[] objArr = {str, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a35524b8a1ef8ee3b60fb966e48f8f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a35524b8a1ef8ee3b60fb966e48f8f4");
        } else {
            this.activity = FFPUtil.idOfObj(activity);
        }
    }

    public CustomTagsEventWithActivity() {
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.WithActivity
    @NonNull
    public String activity() {
        return this.activity;
    }
}
