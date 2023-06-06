package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.transition.u;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.view.menu.j;
import android.view.MenuItem;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class BottomNavigationPresenter implements j {
    public a a;
    public boolean b = false;
    public int c;
    private MenuBuilder d;

    @Override // android.support.v7.view.menu.j
    public final void a(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // android.support.v7.view.menu.j
    public final void a(j.a aVar) {
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a() {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean a(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final boolean b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(Context context, MenuBuilder menuBuilder) {
        this.a.f = this.d;
        this.d = menuBuilder;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(boolean z) {
        if (this.b) {
            return;
        }
        if (z) {
            this.a.a();
            return;
        }
        a aVar = this.a;
        int size = aVar.f.size();
        if (size != aVar.b.length) {
            aVar.a();
            return;
        }
        int i = aVar.c;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = aVar.f.getItem(i2);
            if (item.isChecked()) {
                aVar.c = item.getItemId();
                aVar.d = i2;
            }
        }
        if (i != aVar.c) {
            u.a(aVar, aVar.a);
        }
        for (int i3 = 0; i3 < size; i3++) {
            aVar.e.b = true;
            aVar.b[i3].a((MenuItemImpl) aVar.f.getItem(i3), 0);
            aVar.e.b = false;
        }
    }

    @Override // android.support.v7.view.menu.j
    public final int b() {
        return this.c;
    }

    @Override // android.support.v7.view.menu.j
    public final Parcelable c() {
        SavedState savedState = new SavedState();
        savedState.a = this.a.getSelectedItemId();
        return savedState;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            a aVar = this.a;
            int i = ((SavedState) parcelable).a;
            int size = aVar.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = aVar.f.getItem(i2);
                if (i == item.getItemId()) {
                    aVar.c = i;
                    aVar.d = i2;
                    item.setChecked(true);
                    return;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.design.internal.BottomNavigationPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        int a;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }
}
