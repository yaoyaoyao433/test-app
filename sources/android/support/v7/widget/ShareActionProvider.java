package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.constraint.R;
import android.support.v4.view.ActionProvider;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ShareActionProvider extends ActionProvider {
    final Context a;
    String b;
    private int c;
    private final a d;

    @Override // android.support.v4.view.ActionProvider
    public boolean hasSubMenu() {
        return true;
    }

    @Override // android.support.v4.view.ActionProvider
    public View onCreateActionView() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.a);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(c.a(this.a, this.b));
        }
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(android.support.v7.content.res.b.b(this.a, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // android.support.v4.view.ActionProvider
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        c a2 = c.a(this.a, this.b);
        PackageManager packageManager = this.a.getPackageManager();
        int a3 = a2.a();
        int min = Math.min(a3, this.c);
        for (int i = 0; i < min; i++) {
            ResolveInfo a4 = a2.a(i);
            subMenu.add(0, i, i, a4.loadLabel(packageManager)).setIcon(a4.loadIcon(packageManager)).setOnMenuItemClickListener(this.d);
        }
        if (min < a3) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.a.getString(R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < a3; i2++) {
                ResolveInfo a5 = a2.a(i2);
                addSubMenu.add(0, i2, i2, a5.loadLabel(packageManager)).setIcon(a5.loadIcon(packageManager)).setOnMenuItemClickListener(this.d);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a implements MenuItem.OnMenuItemClickListener {
        final /* synthetic */ ShareActionProvider a;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Intent b = c.a(this.a.a, this.a.b).b(menuItem.getItemId());
            if (b != null) {
                String action = b.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    ShareActionProvider.a(b);
                }
                this.a.a.startActivity(b);
                return true;
            }
            return true;
        }
    }

    static void a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(134742016);
        } else {
            intent.addFlags(524288);
        }
    }
}
