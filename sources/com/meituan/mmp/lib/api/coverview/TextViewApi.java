package com.meituan.mmp.lib.api.coverview;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.utils.al;
import com.meituan.mmp.lib.utils.i;
import com.meituan.mmp.lib.widget.MMPTextView;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TextViewApi extends NativeViewApi<MMPTextView> {
    public static ChangeQuickRedirect h;

    private double a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a57d34a48dd039702e65b3e405684d41", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a57d34a48dd039702e65b3e405684d41")).doubleValue() : d > 1.0d ? d - 1.0d : d;
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "viewId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ MMPTextView b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62ef266819b9d178d5c1c9ee837737a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62ef266819b9d178d5c1c9ee837737a5");
        }
        MMPTextView mMPTextView = new MMPTextView(getContext());
        mMPTextView.setIncludeFontPadding(false);
        return mMPTextView;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ee245ab0b77aaaf5d3144c68e6f3b32", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ee245ab0b77aaaf5d3144c68e6f3b32") : new String[]{"insertTextView", "removeTextView", "updateTextView"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c40a353982dec9a36c58b6d9a7d73c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c40a353982dec9a36c58b6d9a7d73c1");
        } else if ("insertTextView".equals(str)) {
            Object[] objArr2 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8925b9204b27ac72a9cd1bcf7769292e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8925b9204b27ac72a9cd1bcf7769292e");
            } else {
                MMPTextView d = d(jSONObject, iApiCallback);
                if (d != null) {
                    a(jSONObject, d(jSONObject), a(jSONObject), (CoverViewWrapper) d.getParent());
                    iApiCallback.onSuccess(null);
                }
            }
            b(jSONObject, iApiCallback);
        } else if ("removeTextView".equals(str)) {
            a(jSONObject, iApiCallback);
        } else if ("updateTextView".equals(str)) {
            Object[] objArr3 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect3 = h;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3de8ad896ed6ada0818d5303a23cc9bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3de8ad896ed6ada0818d5303a23cc9bd");
            } else {
                String d2 = d(jSONObject);
                int a = a(jSONObject);
                CoverViewWrapper c = c(jSONObject, iApiCallback);
                if (c != null) {
                    if (((TextView) c.b(TextView.class)) == null) {
                        iApiCallback.onFail(a("view not found!", new Object[0]));
                    } else {
                        a(jSONObject, d2);
                        a(jSONObject, d2, a, c);
                        iApiCallback.onSuccess(null);
                    }
                }
            }
            b(jSONObject, iApiCallback);
        }
    }

    private JSONObject a(boolean z, JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a228a5b361d8a7e6ad89b7423ea58e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a228a5b361d8a7e6ad89b7423ea58e2");
        }
        if (z && TextUtils.equals(jSONObject2.optString(TextAlign.LOWER_CASE_NAME), "center")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("padding");
            try {
                optJSONArray.put(0, a(optJSONArray.getDouble(0)));
                optJSONArray.put(2, a(optJSONArray.getDouble(2)));
                jSONObject.put("padding", optJSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
        return jSONObject;
    }

    private void a(JSONObject jSONObject, final String str, final int i, CoverViewWrapper coverViewWrapper) {
        Object[] objArr = {jSONObject, str, Integer.valueOf(i), coverViewWrapper};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e86eff0da82e3952656388ce64efdecc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e86eff0da82e3952656388ce64efdecc");
            return;
        }
        MMPTextView mMPTextView = (MMPTextView) coverViewWrapper.b(MMPTextView.class);
        coverViewWrapper.a(a(mMPTextView.c, jSONObject.optJSONObject("style"), jSONObject.optJSONObject("label")));
        a(mMPTextView, jSONObject.optJSONObject("label"));
        boolean optBoolean = jSONObject.optBoolean("clickable");
        boolean optBoolean2 = jSONObject.optBoolean("gesture", false);
        if (jSONObject.has("gesture")) {
            if (mMPTextView.getTag("mmp_touch".hashCode()) != null) {
                d dVar = (d) mMPTextView.getTag("mmp_touch".hashCode());
                if (optBoolean2 != dVar.b) {
                    dVar.b = optBoolean2;
                }
            } else if (optBoolean2) {
                d dVar2 = new d(str, i, this.d, ViewConfiguration.get(getContext()).getScaledTouchSlop());
                mMPTextView.setTag("mmp_touch".hashCode(), dVar2);
                mMPTextView.setOnTouchListener(dVar2);
            }
        }
        if (jSONObject.has("clickable")) {
            mMPTextView.setOnClickListener(null);
        }
        if (optBoolean2 || !optBoolean) {
            return;
        }
        final JSONObject optJSONObject = jSONObject.optJSONObject("data");
        mMPTextView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.coverview.TextViewApi.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JSONObject jSONObject2;
                JSONException e;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55994db5e5fa12bf356a1cbe2edf4314", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55994db5e5fa12bf356a1cbe2edf4314");
                    return;
                }
                try {
                    jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("id", str);
                        jSONObject2.put("data", optJSONObject);
                    } catch (JSONException e2) {
                        e = e2;
                        e.printStackTrace();
                        TextViewApi.this.d.a("onTextViewClick", jSONObject2, i);
                    }
                } catch (JSONException e3) {
                    jSONObject2 = null;
                    e = e3;
                }
                TextViewApi.this.d.a("onTextViewClick", jSONObject2, i);
            }
        });
    }

    private static void a(MMPTextView mMPTextView, JSONObject jSONObject) {
        Object[] objArr = {mMPTextView, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f7af854dac748d3befc734acb80e0e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f7af854dac748d3befc734acb80e0e6");
        } else if (mMPTextView == null || jSONObject == null) {
        } else {
            try {
                String string = jSONObject.getString("color");
                if (!TextUtils.isEmpty(string)) {
                    mMPTextView.setTextColor(i.b(string));
                }
            } catch (JSONException unused) {
            }
            try {
                if (jSONObject.has("fontSize")) {
                    mMPTextView.setTextSize(1, (float) jSONObject.getDouble("fontSize"));
                }
            } catch (JSONException unused2) {
            }
            try {
                String string2 = jSONObject.getString(TextAlign.LOWER_CASE_NAME);
                if ("left".equals(string2)) {
                    mMPTextView.setGravity(3);
                } else if ("center".equals(string2)) {
                    mMPTextView.setGravity(17);
                } else if ("right".equals(string2)) {
                    mMPTextView.setGravity(5);
                }
            } catch (JSONException unused3) {
            }
            try {
                String string3 = jSONObject.getString(FontWeight.LOWER_CASE_NAME);
                if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(string3)) {
                    mMPTextView.setFakeBoldText(true);
                } else if ("normal".equals(string3)) {
                    mMPTextView.setFakeBoldText(false);
                }
            } catch (JSONException unused4) {
            }
            try {
                String string4 = jSONObject.getString("lineBreak");
                if ("ellipsis".equals(string4)) {
                    mMPTextView.setEllipsize(TextUtils.TruncateAt.END);
                    mMPTextView.setSingleLine(true);
                } else if ("clip".equals(string4)) {
                    mMPTextView.setSingleLine(true);
                } else if ("break-word".equals(string4)) {
                    mMPTextView.setSingleLine(false);
                } else if ("break-all".equals(string4)) {
                    mMPTextView.setSingleLine(false);
                }
            } catch (JSONException unused5) {
            }
            al.a(mMPTextView, jSONObject);
            try {
                mMPTextView.setText(jSONObject.getString("content"));
            } catch (JSONException unused6) {
            }
        }
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final void a(JSONObject jSONObject, IApiCallback iApiCallback) {
        b coverUpdateObserver;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693f86bb02dcd870a126d8c4d8935795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693f86bb02dcd870a126d8c4d8935795");
            return;
        }
        CoverViewWrapper c = c(jSONObject, iApiCallback);
        if (c != null) {
            TextView textView = (TextView) c.b(TextView.class);
            ((ViewGroup) c.getParent()).removeView(c);
            if ((textView instanceof MMPTextView) && (coverUpdateObserver = ((MMPTextView) textView).getCoverUpdateObserver()) != null) {
                coverUpdateObserver.a();
            }
            iApiCallback.onSuccess(null);
            return;
        }
        iApiCallback.onFail(a("view not found!", new Object[0]));
    }

    private void b(JSONObject jSONObject, IApiCallback iApiCallback) {
        TextView textView;
        b coverUpdateObserver;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e16638617c4279233f6ac4431365c52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e16638617c4279233f6ac4431365c52");
            return;
        }
        CoverViewWrapper c = c(jSONObject, iApiCallback);
        if (c == null || (textView = (TextView) c.b(TextView.class)) == null || !(textView instanceof MMPTextView) || (coverUpdateObserver = ((MMPTextView) textView).getCoverUpdateObserver()) == null) {
            return;
        }
        coverUpdateObserver.a();
    }
}
