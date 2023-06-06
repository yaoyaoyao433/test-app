package com.dianping.shield.debug;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PagePerformanceActivity extends AppCompatActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PerformanceAdapter adapter;
    private Button button;
    private ListView listView;
    private PerformanceManager manager;
    private String pageName;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1110b737f0e05a20bc25608965bed39e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1110b737f0e05a20bc25608965bed39e");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_page_performance);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.a(true);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            try {
                this.pageName = getIntent().getExtras().getString("pagename");
            } catch (Exception unused) {
            }
        }
        this.manager = new PerformanceManager(getBaseContext());
        Button button = new Button(getBaseContext());
        button.setText("清除 " + this.pageName + " 数据");
        button.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.debug.PagePerformanceActivity.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f9380d2fce175836f4c2751e6bafb691", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f9380d2fce175836f4c2751e6bafb691");
                    return;
                }
                PagePerformanceActivity.this.manager.clearData(PagePerformanceActivity.this.pageName);
                PagePerformanceActivity.this.finish();
            }
        });
        this.listView = (ListView) findViewById(R.id.activity_page_performance);
        this.listView.addHeaderView(button);
        this.adapter = new PerformanceAdapter(getBaseContext(), this.manager.searchPage(this.pageName), true);
        this.listView.setAdapter((ListAdapter) this.adapter);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fee708b97ac0b090b32a0eeb141cdcc2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fee708b97ac0b090b32a0eeb141cdcc2")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf0e9753c982a64e16bd5e4f0f7909a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf0e9753c982a64e16bd5e4f0f7909a3");
            return;
        }
        super.onResume();
        if (this.adapter != null) {
            this.adapter.swapCursor(this.manager.searchPage(this.pageName));
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "641d45c637975869ce51b3f45772d7a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "641d45c637975869ce51b3f45772d7a7");
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
            Object[] objArr = {PagePerformanceActivity.this, context, cursor, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d89ddb6159a3a7809272d013e07c73a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d89ddb6159a3a7809272d013e07c73a0");
            }
        }

        public PerformanceAdapter(Context context, Cursor cursor, int i) {
            super(context, cursor, i);
            Object[] objArr = {PagePerformanceActivity.this, context, cursor, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a46c11686eb7839651849923726e74cd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a46c11686eb7839651849923726e74cd");
            }
        }

        @Override // android.widget.CursorAdapter
        public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
            Object[] objArr = {context, cursor, viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43782732f43aa9357505249c875582b1", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43782732f43aa9357505249c875582b1");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cebec5eafd34641da4b65211b019eca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cebec5eafd34641da4b65211b019eca");
            } else if (view instanceof TextView) {
                StringBuilder sb = new StringBuilder();
                long j = cursor.getLong(cursor.getColumnIndex("TimeCost"));
                int i = cursor.getInt(cursor.getColumnIndex("RunTimes"));
                float f = cursor.getFloat(cursor.getColumnIndex("AvgTime"));
                sb.append("TimeCost: ");
                sb.append(j);
                sb.append("\n");
                sb.append("RunTimes: ");
                sb.append(i);
                sb.append("\n\n");
                sb.append("AvgTimeCost: ");
                sb.append(f);
                view.setBackgroundColor(-1);
                ((TextView) view).setText(sb.toString());
            }
        }
    }
}
