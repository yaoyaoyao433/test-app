package com.sankuai.waimai.alita.core.intention;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArraySet;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.utils.k;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AlitaIntention implements Serializable {
    public static ChangeQuickRedirect a;
    static final CharSequence b = CommonConstant.Symbol.COMMA;
    public static final a[] c = a.valuesCustom();
    @SerializedName("name")
    public String d;
    @SerializedName("scene_key")
    String e;
    @SerializedName("scene_id")
    int f;
    @SerializedName("intention_id")
    int g;
    @SerializedName("exp_param")
    public Map<String, Object> h;
    @SerializedName("exp_group_info")
    public Map<String, Object> i;
    @SerializedName("biz")
    public String j;
    @SerializedName("type")
    @IntentionType
    int k;
    @SerializedName("version")
    int l;
    @SerializedName("score")
    float m;
    @SerializedName("source")
    @IntentSource
    int n;
    @SerializedName("clear_opportunity")
    @JsonAdapter(ClearFlagAdapter.class)
    Set<String> o;
    @SerializedName("session_id")
    String p;
    @SerializedName("info")
    private Map<String, Object> q;
    @SerializedName(AtMeInfo.TIME_STAMP)
    private long r;

    /* compiled from: ProGuard */
    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
    /* loaded from: classes4.dex */
    public @interface IntentSource {
    }

    /* compiled from: ProGuard */
    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
    /* loaded from: classes4.dex */
    public @interface IntentionType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        NONE(0),
        SESSION_ID_UPDATED(1);
        
        public static ChangeQuickRedirect a;
        public int d;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ef05e5038aa97edf6159549fffc2e2d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ef05e5038aa97edf6159549fffc2e2d") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92e1c1c5ad3d200689a10cb06a81556d", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92e1c1c5ad3d200689a10cb06a81556d") : (a[]) values().clone();
        }

        a(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05bcec8bb35c9df354c605d32f362bdf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05bcec8bb35c9df354c605d32f362bdf");
            } else {
                this.d = i;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class ClearFlagAdapter extends TypeAdapter<Set<String>> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ Set<String> read(JsonReader jsonReader) throws IOException {
            Object[] objArr = {jsonReader};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f475c6138da447779e623c6cf6f07b", RobustBitConfig.DEFAULT_VALUE)) {
                return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f475c6138da447779e623c6cf6f07b");
            }
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.STRING) {
                String[] split = jsonReader.nextString().split(CommonConstant.Symbol.COMMA);
                ArraySet arraySet = new ArraySet();
                for (String str : split) {
                    if (!TextUtils.isEmpty(str.trim())) {
                        arraySet.add(str.trim());
                    }
                }
                return arraySet.size() > 0 ? arraySet : new ArraySet();
            }
            throw new IllegalStateException("AlitaIntention.clearOpportunityFlags 期望的类型是 String，实际的类型是 " + peek);
        }

        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ void write(JsonWriter jsonWriter, Set<String> set) throws IOException {
            Set<String> set2 = set;
            Object[] objArr = {jsonWriter, set2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc4f2a588126be54428c21fd0c69369", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc4f2a588126be54428c21fd0c69369");
            } else if (set2 == null || set2.size() <= 0) {
            } else {
                jsonWriter.value(TextUtils.join(AlitaIntention.b, set2));
            }
        }
    }

    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2d812745ff6ae68080b19d151178abf", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2d812745ff6ae68080b19d151178abf") : Collections.unmodifiableMap(this.q);
    }

    public static AlitaIntention a(String str) throws JsonSyntaxException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51541a6eebadfbdbed6da0a8c77e6c91", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaIntention) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51541a6eebadfbdbed6da0a8c77e6c91");
        }
        AlitaIntention alitaIntention = (AlitaIntention) k.a().fromJson(str, (Class<Object>) AlitaIntention.class);
        alitaIntention.p = com.sankuai.waimai.alita.platform.a.b();
        long b2 = com.meituan.android.time.c.b();
        Object[] objArr2 = {new Long(b2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, alitaIntention, changeQuickRedirect2, false, "1fdf2ce1008068fa2f0ea6a112a876fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, alitaIntention, changeQuickRedirect2, false, "1fdf2ce1008068fa2f0ea6a112a876fc");
        } else {
            alitaIntention.r = b2;
        }
        return alitaIntention;
    }

    public final JSONObject b() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7693d5a3bdecf2b8d4307ebf6b82eb49", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7693d5a3bdecf2b8d4307ebf6b82eb49") : new JSONObject(k.a().toJson(this));
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb5b33ece54680316e485863d3547d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb5b33ece54680316e485863d3547d3");
        }
        return "AlitaIntention{name='" + this.d + "', scene_key='" + this.e + "', scene_id=" + this.f + ", intention_id=" + this.g + ", exp_group_info=" + this.i + ", exp_param=" + this.h + ", biz='" + this.j + "', type=" + this.k + ", version=" + this.l + ", score=" + this.m + ", source=" + this.n + ", info=" + this.q + ", clearOpportunityFlag=" + this.o + '}';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull Map<String, Object> map, @NonNull String str, @Nullable Object obj) {
        Object[] objArr = {map, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046cdb9503b81d90704c81bad77f1919", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046cdb9503b81d90704c81bad77f1919");
        } else if (obj != null) {
            map.put(str, obj);
        }
    }
}
