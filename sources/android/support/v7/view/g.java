package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.x;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class g extends MenuInflater {
    static final Class<?>[] a;
    static final Class<?>[] b;
    final Object[] c;
    final Object[] d;
    Context e;
    Object f;

    static {
        Class<?>[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }

    public g(Context context) {
        super(context);
        this.e = context;
        this.c = new Object[]{context};
        this.d = this.c;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        XmlResourceParser layout;
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                layout = this.e.getResources().getLayout(i);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (XmlPullParserException e2) {
            e = e2;
        }
        try {
            a(layout, Xml.asAttributeSet(layout), menu);
            if (layout != null) {
                layout.close();
            }
        } catch (IOException e3) {
            e = e3;
            throw new InflateException("Error inflating menu XML", e);
        } catch (XmlPullParserException e4) {
            e = e4;
            throw new InflateException("Error inflating menu XML", e);
        } catch (Throwable th2) {
            th = th2;
            xmlResourceParser = layout;
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        r4 = r11;
        r6 = null;
        r11 = false;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r11 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        switch(r4) {
            case 1: goto L55;
            case 2: goto L39;
            case 3: goto L10;
            default: goto L59;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        r4 = r9.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r5 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r4.equals(r6) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        r6 = null;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r4.equals("group") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r4.equals("item") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
        if (r0.a != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r0.b == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        if (r0.b.hasSubMenu() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        r0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r4.equals("menu") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r5 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        r4 = r9.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r4.equals("group") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
        r0.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
        if (r4.equals("item") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
        r0.b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
        if (r4.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
        a(r9, r10, r0.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
        r6 = r4;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
        r4 = r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ca, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.view.Menu r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = this;
            android.support.v7.view.g$b r0 = new android.support.v7.view.g$b
            r0.<init>(r11)
            int r11 = r9.getEventType()
        L9:
            r1 = 2
            r2 = 1
            if (r11 != r1) goto L32
            java.lang.String r11 = r9.getName()
            java.lang.String r1 = "menu"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L1e
            int r11 = r9.next()
            goto L38
        L1e:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Expecting menu, got "
            r10.<init>(r0)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L32:
            int r11 = r9.next()
            if (r11 != r2) goto L9
        L38:
            r1 = 0
            r3 = 0
            r4 = r11
            r6 = r1
            r11 = 0
            r5 = 0
        L3e:
            if (r11 != 0) goto Lca
            switch(r4) {
                case 1: goto Lbc;
                case 2: goto L8b;
                case 3: goto L45;
                default: goto L43;
            }
        L43:
            goto Lc4
        L45:
            java.lang.String r4 = r9.getName()
            if (r5 == 0) goto L55
            boolean r7 = r4.equals(r6)
            if (r7 == 0) goto L55
            r6 = r1
            r5 = 0
            goto Lc4
        L55:
            java.lang.String r7 = "group"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L61
            r0.a()
            goto Lc4
        L61:
            java.lang.String r7 = "item"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L81
            boolean r4 = r0.a
            if (r4 != 0) goto Lc4
            android.support.v4.view.ActionProvider r4 = r0.b
            if (r4 == 0) goto L7d
            android.support.v4.view.ActionProvider r4 = r0.b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L7d
            r0.c()
            goto Lc4
        L7d:
            r0.b()
            goto Lc4
        L81:
            java.lang.String r7 = "menu"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto Lc4
            r11 = 1
            goto Lc4
        L8b:
            if (r5 != 0) goto Lc4
            java.lang.String r4 = r9.getName()
            java.lang.String r7 = "group"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L9d
            r0.a(r10)
            goto Lc4
        L9d:
            java.lang.String r7 = "item"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto La9
            r0.b(r10)
            goto Lc4
        La9:
            java.lang.String r7 = "menu"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto Lb9
            android.view.SubMenu r4 = r0.c()
            r8.a(r9, r10, r4)
            goto Lc4
        Lb9:
            r6 = r4
            r5 = 1
            goto Lc4
        Lbc:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "Unexpected end of document"
            r9.<init>(r10)
            throw r9
        Lc4:
            int r4 = r9.next()
            goto L3e
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.g.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object a(Object obj) {
        while (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        return obj;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] a = {MenuItem.class};
        private Object b;
        private Method c;

        public a(Object obj, String str) {
            this.b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.c = cls.getMethod(str, a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.c.invoke(this.b, menuItem)).booleanValue();
                }
                this.c.invoke(this.b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b {
        private String A;
        private String B;
        private CharSequence C;
        private CharSequence D;
        private ColorStateList E = null;
        private PorterDuff.Mode F = null;
        boolean a;
        ActionProvider b;
        private Menu d;
        private int e;
        private int f;
        private int g;
        private int h;
        private boolean i;
        private boolean j;
        private int k;
        private int l;
        private CharSequence m;
        private CharSequence n;
        private int o;
        private char p;
        private int q;
        private char r;
        private int s;
        private int t;
        private boolean u;
        private boolean v;
        private boolean w;
        private int x;
        private int y;
        private String z;

        public b(Menu menu) {
            this.d = menu;
            a();
        }

        public final void a() {
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = true;
            this.j = true;
        }

        public final void a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.e.obtainStyledAttributes(attributeSet, new int[]{16842766, 16842960, 16843156, 16843230, 16843231, 16843232});
            this.e = obtainStyledAttributes.getResourceId(1, 0);
            this.f = obtainStyledAttributes.getInt(3, 0);
            this.g = obtainStyledAttributes.getInt(4, 0);
            this.h = obtainStyledAttributes.getInt(5, 0);
            this.i = obtainStyledAttributes.getBoolean(2, true);
            this.j = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public final void b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.e.obtainStyledAttributes(attributeSet, new int[]{16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.alphabeticModifiers, R.attr.numericModifiers, R.attr.showAsAction, R.attr.actionLayout, R.attr.actionViewClass, R.attr.actionProviderClass, R.attr.contentDescription, R.attr.tooltipText, R.attr.iconTint, R.attr.iconTintMode});
            this.k = obtainStyledAttributes.getResourceId(2, 0);
            this.l = (obtainStyledAttributes.getInt(5, this.f) & SupportMenu.CATEGORY_MASK) | (obtainStyledAttributes.getInt(6, this.g) & SupportMenu.USER_MASK);
            this.m = obtainStyledAttributes.getText(7);
            this.n = obtainStyledAttributes.getText(8);
            this.o = obtainStyledAttributes.getResourceId(0, 0);
            this.p = a(obtainStyledAttributes.getString(9));
            this.q = obtainStyledAttributes.getInt(13, 4096);
            this.r = a(obtainStyledAttributes.getString(10));
            this.s = obtainStyledAttributes.getInt(14, 4096);
            if (obtainStyledAttributes.hasValue(11)) {
                this.t = obtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
            } else {
                this.t = this.h;
            }
            this.u = obtainStyledAttributes.getBoolean(3, false);
            this.v = obtainStyledAttributes.getBoolean(4, this.i);
            this.w = obtainStyledAttributes.getBoolean(1, this.j);
            this.x = obtainStyledAttributes.getInt(15, -1);
            this.B = obtainStyledAttributes.getString(12);
            this.y = obtainStyledAttributes.getResourceId(16, 0);
            this.z = obtainStyledAttributes.getString(17);
            this.A = obtainStyledAttributes.getString(18);
            if ((this.A != null) && this.y == 0 && this.z == null) {
                this.b = (ActionProvider) a(this.A, g.b, g.this.d);
            } else {
                this.b = null;
            }
            this.C = obtainStyledAttributes.getText(19);
            this.D = obtainStyledAttributes.getText(20);
            if (obtainStyledAttributes.hasValue(22)) {
                this.F = x.a(obtainStyledAttributes.getInt(22, -1), this.F);
            } else {
                this.F = null;
            }
            if (obtainStyledAttributes.hasValue(21)) {
                this.E = obtainStyledAttributes.getColorStateList(21);
            } else {
                this.E = null;
            }
            obtainStyledAttributes.recycle();
            this.a = false;
        }

        private static char a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private void a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.u).setVisible(this.v).setEnabled(this.w).setCheckable(this.t > 0).setTitleCondensed(this.n).setIcon(this.o);
            if (this.x >= 0) {
                menuItem.setShowAsAction(this.x);
            }
            if (this.B != null) {
                if (g.this.e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                g gVar = g.this;
                if (gVar.f == null) {
                    gVar.f = gVar.a(gVar.e);
                }
                menuItem.setOnMenuItemClickListener(new a(gVar.f, this.B));
            }
            if (this.t >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).a(true);
                } else if (menuItem instanceof android.support.v7.view.menu.g) {
                    android.support.v7.view.menu.g gVar2 = (android.support.v7.view.menu.g) menuItem;
                    try {
                        if (gVar2.e == null) {
                            gVar2.e = ((SupportMenuItem) gVar2.d).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        gVar2.e.invoke(gVar2.d, Boolean.TRUE);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            if (this.z != null) {
                menuItem.setActionView((View) a(this.z, g.a, g.this.c));
                z = true;
            }
            if (this.y > 0 && !z) {
                menuItem.setActionView(this.y);
            }
            if (this.b != null) {
                MenuItemCompat.setActionProvider(menuItem, this.b);
            }
            MenuItemCompat.setContentDescription(menuItem, this.C);
            MenuItemCompat.setTooltipText(menuItem, this.D);
            MenuItemCompat.setAlphabeticShortcut(menuItem, this.p, this.q);
            MenuItemCompat.setNumericShortcut(menuItem, this.r, this.s);
            if (this.F != null) {
                MenuItemCompat.setIconTintMode(menuItem, this.F);
            }
            if (this.E != null) {
                MenuItemCompat.setIconTintList(menuItem, this.E);
            }
        }

        public final void b() {
            this.a = true;
            a(this.d.add(this.e, this.k, this.l, this.m));
        }

        public final SubMenu c() {
            this.a = true;
            SubMenu addSubMenu = this.d.addSubMenu(this.e, this.k, this.l, this.m);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        private <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = g.this.e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }
    }
}
