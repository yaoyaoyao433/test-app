package android.support.v7.view.menu;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.view.menu.g;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
/* compiled from: ProGuard */
@RequiresApi(16)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class MenuItemWrapperJB extends g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemWrapperJB(Context context, SupportMenuItem supportMenuItem) {
        super(context, supportMenuItem);
    }

    @Override // android.support.v7.view.menu.g
    final g.a a(ActionProvider actionProvider) {
        return new ActionProviderWrapperJB(this.a, actionProvider);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class ActionProviderWrapperJB extends g.a implements ActionProvider.VisibilityListener {
        ActionProvider.VisibilityListener c;

        public ActionProviderWrapperJB(Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // android.support.v4.view.ActionProvider
        public View onCreateActionView(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        @Override // android.support.v4.view.ActionProvider
        public boolean overridesItemVisibility() {
            return this.a.overridesItemVisibility();
        }

        @Override // android.support.v4.view.ActionProvider
        public boolean isVisible() {
            return this.a.isVisible();
        }

        @Override // android.support.v4.view.ActionProvider
        public void refreshVisibility() {
            this.a.refreshVisibility();
        }

        @Override // android.support.v4.view.ActionProvider
        public void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
            this.c = visibilityListener;
            this.a.setVisibilityListener(visibilityListener != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.c != null) {
                this.c.onActionProviderVisibilityChanged(z);
            }
        }
    }
}
