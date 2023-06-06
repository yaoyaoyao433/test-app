package com.sankuai.waimai.machpro.debug;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.mach.manager.cache.c;
import com.sankuai.waimai.machpro.util.b;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(final ViewGroup viewGroup, Throwable th, c cVar, HashMap<String, c> hashMap) {
        Object[] objArr = {viewGroup, th, cVar, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b623bdf7b8b7e5eae6562095badd818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b623bdf7b8b7e5eae6562095badd818");
            return;
        }
        final LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setBackgroundColor(-1);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(viewGroup.getContext());
        textView.setTextSize(0, b.b(16.0f));
        textView.setBackgroundColor(b.b("#ff000066"));
        textView.setTextColor(-1);
        textView.setText(b.a(th, cVar, hashMap));
        textView.setPadding(0, (int) b.b(22.0f), 0, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(textView, layoutParams);
        TextView textView2 = new TextView(viewGroup.getContext());
        textView2.setText("关闭");
        textView2.setGravity(17);
        textView2.setTextColor(-1);
        textView2.setTextSize(0, b.b(22.0f));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) b.b(50.0f));
        textView2.setBackgroundColor(b.b("#00ff0066"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.machpro.debug.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f72d19ef6764bdb01d963d9db2bff989", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f72d19ef6764bdb01d963d9db2bff989");
                } else {
                    viewGroup.removeView(linearLayout);
                }
            }
        });
        linearLayout.addView(textView2, layoutParams2);
        viewGroup.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
    }

    public static com.sankuai.waimai.machpro.container.a a(com.sankuai.waimai.machpro.container.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d717955f25c6558eefc40dd2061a2302", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.machpro.container.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d717955f25c6558eefc40dd2061a2302");
        }
        try {
            String a2 = l.a(bVar.aA_(), "mp_local_server_channel", "mp_local_server_key", "");
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a2);
            JSONObject optJSONObject = jSONObject.optJSONObject(bVar.j());
            String str = "";
            String str2 = "";
            if (optJSONObject == null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
                    if (TextUtils.equals(optJSONObject2.optString("main_bundle"), bVar.j()) && optJSONObject2.optBoolean("is_sub_bundle")) {
                        str = optJSONObject2.optString("url");
                        str2 = next;
                    }
                    optJSONObject = optJSONObject2;
                }
            }
            if (optJSONObject != null && TextUtils.isEmpty(str)) {
                str = optJSONObject.optString("url");
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            TextUtils.isEmpty(str2);
            return (com.sankuai.waimai.machpro.container.a) Class.forName("com.sankuai.waimai.mach.assistant.playground.machpro.MPPlaygroundRenderDelegate").getConstructor(com.sankuai.waimai.machpro.container.b.class).newInstance(bVar);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void a(Object obj, ViewGroup viewGroup, String str) {
        View view;
        Object[] objArr = {obj, viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fdc61c3fe3317b83a9f96bb2515296a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fdc61c3fe3317b83a9f96bb2515296a");
            return;
        }
        try {
            Class<?> cls = Class.forName("com.sankuai.waimai.mach.assistant.playground.MPToolsHelper");
            view = (View) cls.getMethod("getTagView", Context.class, String.class).invoke(cls.getConstructor(Object.class, String.class).newInstance(obj, str), viewGroup.getContext(), str);
        } catch (Exception e) {
            e.printStackTrace();
            view = null;
        }
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) MapConstant.ANIMATION_DURATION_SHORT);
            layoutParams.gravity = 5;
            layoutParams.topMargin = 1000;
            viewGroup.addView(view, layoutParams);
        }
    }
}
