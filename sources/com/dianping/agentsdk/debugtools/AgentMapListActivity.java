package com.dianping.agentsdk.debugtools;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AgentMapListActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a;
    private HashMap<String, b> b;
    private List<b> c;
    private int d;
    private PopupWindow e;
    private EditText f;
    private TextView g;
    private TextView h;
    private FrameLayout i;
    private String j;
    private a k;
    private ListView l;

    public AgentMapListActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291d456e3c2e61076bb104358c01d7e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291d456e3c2e61076bb104358c01d7e3");
            return;
        }
        this.c = new ArrayList();
        this.d = 0;
    }

    public static /* synthetic */ void a(AgentMapListActivity agentMapListActivity, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, agentMapListActivity, changeQuickRedirect, false, "6e21e02cabae1e4e709d891051d68f87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, agentMapListActivity, changeQuickRedirect, false, "6e21e02cabae1e4e709d891051d68f87");
        } else {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    public static /* synthetic */ void a(AgentMapListActivity agentMapListActivity, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, agentMapListActivity, changeQuickRedirect, false, "254f1fee2100b098c112593e1cc2e64b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, agentMapListActivity, changeQuickRedirect, false, "254f1fee2100b098c112593e1cc2e64b");
        } else if (!TextUtils.isEmpty(str)) {
            agentMapListActivity.c.clear();
            for (Map.Entry<String, b> entry : agentMapListActivity.b.entrySet()) {
                if (agentMapListActivity.d == 0) {
                    if (entry.getKey().contains(str)) {
                        agentMapListActivity.c.add(entry.getValue());
                    }
                } else if (agentMapListActivity.d == 1) {
                    b value = entry.getValue();
                    if (value.c.contains(str)) {
                        agentMapListActivity.c.add(value);
                    }
                }
            }
            agentMapListActivity.k.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e97f77a82229d229a4535c0c972eb425", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e97f77a82229d229a4535c0c972eb425");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.agentmap_list_activity);
        if (getSupportActionBar() != null) {
            getSupportActionBar().c();
        }
        this.b = new HashMap<>();
        this.f = (EditText) findViewById(R.id.search_edit);
        this.g = (TextView) findViewById(R.id.spinner_text);
        this.h = (TextView) findViewById(R.id.search_text);
        this.i = (FrameLayout) findViewById(R.id.search_content);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.agentsdk.debugtools.AgentMapListActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14123e8316608d6e7e31fa725cbbcc8c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14123e8316608d6e7e31fa725cbbcc8c");
                } else {
                    p.a(AgentMapListActivity.this.e, view, 20, 0);
                }
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.agentsdk.debugtools.AgentMapListActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7220043768db6b04704fbb9dcb5e62ba", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7220043768db6b04704fbb9dcb5e62ba");
                    return;
                }
                AgentMapListActivity.a(AgentMapListActivity.this, AgentMapListActivity.this.j);
                AgentMapListActivity.a(AgentMapListActivity.this, AgentMapListActivity.this.h);
            }
        });
        this.f.addTextChangedListener(new TextWatcher() { // from class: com.dianping.agentsdk.debugtools.AgentMapListActivity.3
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr2 = {editable};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27ea00f5c46d0c389d55f2133aa68936", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27ea00f5c46d0c389d55f2133aa68936");
                } else {
                    AgentMapListActivity.this.j = editable.toString().trim();
                }
            }
        });
        this.f.setOnKeyListener(new View.OnKeyListener() { // from class: com.dianping.agentsdk.debugtools.AgentMapListActivity.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {view, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6117cafb7872db9a6fc7bb2f711bbb5", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6117cafb7872db9a6fc7bb2f711bbb5")).booleanValue();
                }
                if (i == 66) {
                    AgentMapListActivity.a(AgentMapListActivity.this, AgentMapListActivity.this.j);
                }
                return false;
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5de184aaddeb2722a6c8345f15b311f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5de184aaddeb2722a6c8345f15b311f");
        } else {
            this.l = new ListView(this);
            this.l.setOnTouchListener(new View.OnTouchListener() { // from class: com.dianping.agentsdk.debugtools.AgentMapListActivity.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object[] objArr3 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d5ac55d20efadaa0d4f467665370e1fd", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d5ac55d20efadaa0d4f467665370e1fd")).booleanValue();
                    }
                    if (motionEvent.getAction() == 0) {
                        AgentMapListActivity.a(AgentMapListActivity.this, AgentMapListActivity.this.h);
                    }
                    return false;
                }
            });
            this.k = new a(getApplicationContext(), this.c);
            this.l.setAdapter((ListAdapter) this.k);
            this.i.addView(this.l);
            this.c.clear();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31059e12e5e8bf3e4d37aeddf9ae590a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31059e12e5e8bf3e4d37aeddf9ae590a");
        } else {
            View inflate = LayoutInflater.from(this).inflate(R.layout.agentmap_list_search_popup_window, (ViewGroup) null);
            this.e = new PopupWindow(inflate, -2, -2, true);
            ((TextView) inflate.findViewById(R.id.key)).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.agentsdk.debugtools.AgentMapListActivity.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "466d6bcb9b03aa82455627af4e24f58b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "466d6bcb9b03aa82455627af4e24f58b");
                        return;
                    }
                    AgentMapListActivity.this.d = 0;
                    AgentMapListActivity.this.f.setText("");
                    AgentMapListActivity.this.g.setText("键值");
                    AgentMapListActivity.this.k.a();
                    AgentMapListActivity.this.k.notifyDataSetChanged();
                    p.b(AgentMapListActivity.this.e);
                    AgentMapListActivity.this.f.setHint("搜索键值");
                }
            });
            ((TextView) inflate.findViewById(R.id.agent)).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.agentsdk.debugtools.AgentMapListActivity.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bee4ed13a682835cb96835b361f5e800", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bee4ed13a682835cb96835b361f5e800");
                        return;
                    }
                    AgentMapListActivity.this.d = 1;
                    AgentMapListActivity.this.f.setText("");
                    AgentMapListActivity.this.g.setText("类名");
                    AgentMapListActivity.this.k.a();
                    AgentMapListActivity.this.k.notifyDataSetChanged();
                    p.b(AgentMapListActivity.this.e);
                    AgentMapListActivity.this.f.setHint("搜索类名");
                }
            });
            this.e.setTouchable(true);
            this.e.setTouchInterceptor(new View.OnTouchListener() { // from class: com.dianping.agentsdk.debugtools.AgentMapListActivity.8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            this.e.setBackgroundDrawable(getResources().getDrawable(R.drawable.agentmap_popupwindow_bg));
        }
        a();
        b();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21215c632ea96141c88be3b0dd76fae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21215c632ea96141c88be3b0dd76fae0");
            return;
        }
        for (int i = 0; i < 105; i++) {
            b bVar = new b();
            bVar.c = "com.dianping.shield.test.AgentCarter" + i;
            bVar.b = "Hello Agent" + i;
            HashMap<String, b> hashMap = this.b;
            hashMap.put("Hello Agent" + i, bVar);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262c7bdbdc1fa59f4bff510a4e82e01c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262c7bdbdc1fa59f4bff510a4e82e01c");
            return;
        }
        this.c.clear();
        for (Map.Entry<String, b> entry : this.b.entrySet()) {
            this.c.add(entry.getValue());
        }
        Collections.sort(this.c);
        if (this.k != null) {
            this.k.notifyDataSetChanged();
        }
    }
}
