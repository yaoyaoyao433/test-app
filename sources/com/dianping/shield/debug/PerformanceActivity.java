package com.dianping.shield.debug;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CursorAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import com.dianping.shield.env.ShieldEnvironment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PerformanceActivity extends AppCompatActivity {
    public static final String FILE_NAME = "MergeSharedPerferance";
    public static final String NEED_PERFORMANCE_KEY = "NeedPerformance";
    public static ChangeQuickRedirect changeQuickRedirect;
    private PerformanceAdapter adapter;
    private ListView listView;
    private PerformanceManager manager;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b1851876ea7cc0252d0836684114a78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b1851876ea7cc0252d0836684114a78");
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(8);
        setContentView(R.layout.activity_performance);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.a(true);
        }
        this.manager = new PerformanceManager(getBaseContext());
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.simple_switch_item_layout, (ViewGroup) null);
        ((TextView) linearLayout.findViewById(R.id.text_view)).setText("开启性能监控");
        Switch r1 = (Switch) linearLayout.findViewById(R.id.switch_view);
        r1.setChecked(ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(getApplicationContext(), "MergeSharedPerferance").getBoolean("NeedPerformance", false));
        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.dianping.shield.debug.PerformanceActivity.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr2 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3637c14fb5ab22d5e61971bbcc349824", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3637c14fb5ab22d5e61971bbcc349824");
                    return;
                }
                ShieldEnvironment.INSTANCE.getDataStorage().getSharedPreferences(PerformanceActivity.this.getApplicationContext(), "MergeSharedPerferance").edit().putBoolean("NeedPerformance", z);
                ShieldEnvironment.INSTANCE.setNeedPerformance(Boolean.valueOf(z));
            }
        });
        Button button = new Button(getBaseContext());
        button.setText("清除数据");
        button.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.PerformanceActivity.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19c3838d97191c3e3aef37fa8fd5b5de", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19c3838d97191c3e3aef37fa8fd5b5de");
                    return;
                }
                PerformanceActivity.this.manager.clearData();
                PerformanceActivity.this.refreshCursor();
            }
        });
        this.listView = (ListView) findViewById(R.id.activity_performance);
        this.listView.addHeaderView(linearLayout);
        this.listView.addHeaderView(button);
        this.adapter = new PerformanceAdapter(getBaseContext(), this.manager.findPages(), true);
        this.listView.setAdapter((ListAdapter) this.adapter);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56b2c1307fc7f85ae33a639cb3f3e7f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56b2c1307fc7f85ae33a639cb3f3e7f4")).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eada3d352006387ec21d1b1a1f71ad32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eada3d352006387ec21d1b1a1f71ad32");
            return;
        }
        super.onResume();
        refreshCursor();
    }

    public void refreshCursor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbcbaa96f302cf4e38ae561e5f0833a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbcbaa96f302cf4e38ae561e5f0833a5");
            return;
        }
        if (this.adapter != null && this.adapter.getCursor() != null && !this.adapter.getCursor().isClosed()) {
            this.adapter.getCursor().close();
        }
        this.adapter.changeCursor(this.manager.findPages());
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e739bfd3cddfe98fc18ee41d62a73d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e739bfd3cddfe98fc18ee41d62a73d5");
            return;
        }
        if (this.adapter != null && this.adapter.getCursor() != null) {
            this.adapter.getCursor().close();
        }
        super.onDestroy();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class PerformanceAdapter extends CursorAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        public PerformanceAdapter(Context context, Cursor cursor, boolean z) {
            super(context, cursor, z);
            Object[] objArr = {PerformanceActivity.this, context, cursor, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdfbd6f20a5875c60871c017103525a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdfbd6f20a5875c60871c017103525a5");
            }
        }

        public PerformanceAdapter(Context context, Cursor cursor, int i) {
            super(context, cursor, i);
            Object[] objArr = {PerformanceActivity.this, context, cursor, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "237c00e29550efd798f03fc6c4914c7e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "237c00e29550efd798f03fc6c4914c7e");
            }
        }

        @Override // android.widget.CursorAdapter
        public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
            Object[] objArr = {context, cursor, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46d435974263ad8dc4feaa8c81124c18", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46d435974263ad8dc4feaa8c81124c18");
            }
            TextView textView = new TextView(context);
            textView.setBackgroundColor(-1);
            textView.setTextSize(2, 14.0f);
            textView.setTextColor(-16777216);
            textView.setPadding(20, 40, 20, 40);
            return textView;
        }

        @Override // android.widget.CursorAdapter
        public void bindView(View view, Context context, Cursor cursor) {
            Object[] objArr = {view, context, cursor};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "807ac1add88c3bfc3e5fd302f3802116", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "807ac1add88c3bfc3e5fd302f3802116");
            } else if (view instanceof TextView) {
                String string = cursor.getString(0);
                ((TextView) view).setText(string);
                view.setOnClickListener(new OnPageClickListener(string));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class OnPageClickListener implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String pageName;

        public OnPageClickListener(String str) {
            Object[] objArr = {PerformanceActivity.this, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b24cab42c3fafb3776cfa12b16ba36ee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b24cab42c3fafb3776cfa12b16ba36ee");
            } else {
                this.pageName = str;
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4af2643a3ecf6158b8b8b795302e2216", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4af2643a3ecf6158b8b8b795302e2216");
                return;
            }
            Intent intent = new Intent("com.dianping.shield.debugpanel.pageperformance");
            intent.setPackage(PerformanceActivity.this.getPackageName());
            intent.putExtra("pagename", this.pageName);
            PerformanceActivity.this.startActivity(intent);
        }
    }
}
