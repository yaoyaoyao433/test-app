package com.meituan.roodesign.widgets.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.AlertController;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooAlertDialog extends AppCompatDialog implements DialogInterface {
    public static ChangeQuickRedirect a;
    public final AlertController b;

    public RooAlertDialog(@NonNull Context context, @StyleRes int i) {
        super(context, a(context, i));
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c176a928f4811f79d014bbf6df5112bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c176a928f4811f79d014bbf6df5112bf");
        } else {
            this.b = new AlertController(getContext(), this, getWindow());
        }
    }

    public static int a(@NonNull Context context, @StyleRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4806b64bd41f99fd7804ae0235f80d6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4806b64bd41f99fd7804ae0235f80d6b")).intValue();
        }
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.rooAlertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "338950939da162def74c504790edd37e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "338950939da162def74c504790edd37e");
            return;
        }
        super.setTitle(charSequence);
        this.b.a(charSequence);
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        View inflate;
        boolean z;
        boolean z2;
        boolean z3;
        View findViewById;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4cd53370bc3cc5522c47ca9954e873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4cd53370bc3cc5522c47ca9954e873");
            return;
        }
        super.onCreate(bundle);
        final AlertController alertController = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = AlertController.a;
        if (PatchProxy.isSupport(objArr2, alertController, changeQuickRedirect2, false, "aa8b6823fa6e8dcde48aa050f323fddc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, alertController, changeQuickRedirect2, false, "aa8b6823fa6e8dcde48aa050f323fddc");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = AlertController.a;
        if (PatchProxy.isSupport(objArr3, alertController, changeQuickRedirect3, false, "541d99c3418d196209c40318bace9e9e", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr3, alertController, changeQuickRedirect3, false, "541d99c3418d196209c40318bace9e9e")).intValue();
        } else if (alertController.H != 0 && alertController.N == 1) {
            i = alertController.H;
        } else {
            i = alertController.G;
        }
        alertController.c.setContentView(i);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = AlertController.a;
        if (PatchProxy.isSupport(objArr4, alertController, changeQuickRedirect4, false, "512690dc4923e4921b7e2e4cbd2cbc3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, alertController, changeQuickRedirect4, false, "512690dc4923e4921b7e2e4cbd2cbc3d");
            return;
        }
        View findViewById2 = alertController.d.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        Object[] objArr5 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect5 = AlertController.a;
        if (PatchProxy.isSupport(objArr5, alertController, changeQuickRedirect5, false, "7aa15982cb7e56a9eb44bfd0f9a836ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, alertController, changeQuickRedirect5, false, "7aa15982cb7e56a9eb44bfd0f9a836ba");
        } else {
            if (alertController.h != null) {
                inflate = alertController.h;
            } else {
                inflate = alertController.i != 0 ? LayoutInflater.from(alertController.b).inflate(alertController.i, viewGroup, false) : null;
            }
            boolean z4 = inflate != null;
            if (!z4 || !AlertController.a(inflate)) {
                alertController.d.setFlags(131072, 131072);
            }
            if (z4) {
                FrameLayout frameLayout = (FrameLayout) alertController.d.findViewById(R.id.custom);
                frameLayout.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
                if (alertController.n) {
                    frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.m);
                }
                if (alertController.g != null) {
                    ((LinearLayoutCompat.a) viewGroup.getLayoutParams()).g = 0.0f;
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a2 = alertController.a(findViewById6, findViewById3);
        ViewGroup a3 = alertController.a(findViewById7, findViewById4);
        ViewGroup a4 = alertController.a(findViewById8, findViewById5);
        Object[] objArr6 = {a3};
        ChangeQuickRedirect changeQuickRedirect6 = AlertController.a;
        if (PatchProxy.isSupport(objArr6, alertController, changeQuickRedirect6, false, "64e2ec7fc3fc0c56b1264528e92604f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, alertController, changeQuickRedirect6, false, "64e2ec7fc3fc0c56b1264528e92604f7");
        } else {
            alertController.x = (NestedScrollView) alertController.d.findViewById(R.id.scrollView);
            alertController.x.setFocusable(false);
            alertController.x.setNestedScrollingEnabled(false);
            alertController.C = (TextView) a3.findViewById(16908299);
            if (alertController.C != null) {
                if (alertController.f != null) {
                    alertController.C.setText(alertController.f);
                } else {
                    alertController.C.setVisibility(8);
                    alertController.x.removeView(alertController.C);
                    if (alertController.g != null) {
                        ViewGroup viewGroup2 = (ViewGroup) alertController.x.getParent();
                        int indexOfChild = viewGroup2.indexOfChild(alertController.x);
                        viewGroup2.removeViewAt(indexOfChild);
                        viewGroup2.addView(alertController.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                    } else {
                        a3.setVisibility(8);
                    }
                }
            }
        }
        Object[] objArr7 = {a4};
        ChangeQuickRedirect changeQuickRedirect7 = AlertController.a;
        if (PatchProxy.isSupport(objArr7, alertController, changeQuickRedirect7, false, "24a45ccaeb33836e731d1776790c3d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, alertController, changeQuickRedirect7, false, "24a45ccaeb33836e731d1776790c3d26");
        } else {
            alertController.o = (Button) a4.findViewById(16908313);
            alertController.o.setOnClickListener(alertController.P);
            if (TextUtils.isEmpty(alertController.p)) {
                alertController.o.setVisibility(8);
                z = false;
            } else {
                alertController.o.setText(alertController.p);
                alertController.o.setVisibility(0);
                z = true;
            }
            alertController.r = (Button) a4.findViewById(16908314);
            alertController.r.setOnClickListener(alertController.P);
            if (TextUtils.isEmpty(alertController.s)) {
                alertController.r.setVisibility(8);
            } else {
                alertController.r.setText(alertController.s);
                alertController.r.setVisibility(0);
                z |= true;
            }
            alertController.u = (Button) a4.findViewById(16908315);
            alertController.u.setOnClickListener(alertController.P);
            if (TextUtils.isEmpty(alertController.v)) {
                alertController.u.setVisibility(8);
            } else {
                alertController.u.setText(alertController.v);
                alertController.u.setVisibility(0);
                z |= true;
            }
            Context context = alertController.b;
            Object[] objArr8 = {context};
            ChangeQuickRedirect changeQuickRedirect8 = AlertController.a;
            if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "eba834fbfd7dcca6666a3e7cf6fe9ebb", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = true;
                z3 = ((Boolean) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "eba834fbfd7dcca6666a3e7cf6fe9ebb")).booleanValue();
            } else {
                z2 = true;
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.rooAlertDialogCenterButtons, typedValue, true);
                z3 = typedValue.data != 0;
            }
            if (z3) {
                if (z == z2) {
                    alertController.a(alertController.o);
                } else if (z) {
                    alertController.a(alertController.r);
                } else if (z) {
                    alertController.a(alertController.u);
                }
            }
            if (!(z)) {
                a4.setVisibility(8);
            }
        }
        Object[] objArr9 = {a2};
        ChangeQuickRedirect changeQuickRedirect9 = AlertController.a;
        if (PatchProxy.isSupport(objArr9, alertController, changeQuickRedirect9, false, "ad0db03dec5080ef1bc1250d8c1ad50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, alertController, changeQuickRedirect9, false, "ad0db03dec5080ef1bc1250d8c1ad50a");
        } else if (alertController.D != null) {
            a2.addView(alertController.D, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.d.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.A = (ImageView) alertController.d.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.e)) && alertController.M) {
                alertController.B = (TextView) alertController.d.findViewById(R.id.alertTitle);
                alertController.B.setText(alertController.e);
                if (alertController.y != 0) {
                    alertController.A.setImageResource(alertController.y);
                    alertController.B.setGravity(GravityCompat.START);
                } else if (alertController.z != null) {
                    alertController.A.setImageDrawable(alertController.z);
                    alertController.B.setGravity(GravityCompat.START);
                } else {
                    alertController.B.setPadding(alertController.A.getPaddingLeft(), alertController.A.getPaddingTop(), alertController.A.getPaddingRight(), alertController.A.getPaddingBottom());
                    alertController.A.setVisibility(8);
                }
            } else {
                alertController.d.findViewById(R.id.title_template).setVisibility(8);
                alertController.A.setVisibility(8);
                a2.setVisibility(8);
            }
        }
        boolean z5 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        byte b = (a2 == null || a2.getVisibility() == 8) ? (byte) 0 : (byte) 1;
        byte b2 = (a4 == null || a4.getVisibility() == 8) ? (byte) 0 : (byte) 1;
        if (b2 == 0 && a3 != null && (findViewById = a3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (b != 0 && alertController.x != null) {
            alertController.x.setClipToPadding(true);
        }
        if (alertController.g instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) alertController.g;
            Object[] objArr10 = {Byte.valueOf(b), Byte.valueOf(b2)};
            ChangeQuickRedirect changeQuickRedirect10 = AlertController.RecycleListView.a;
            if (PatchProxy.isSupport(objArr10, recycleListView, changeQuickRedirect10, false, "307d2c75a987fcda79f34d271ad68f7f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, recycleListView, changeQuickRedirect10, false, "307d2c75a987fcda79f34d271ad68f7f");
            } else if (b2 == 0 || b == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), b != 0 ? recycleListView.getPaddingTop() : recycleListView.b, recycleListView.getPaddingRight(), b2 != 0 ? recycleListView.getPaddingBottom() : recycleListView.c);
            }
        }
        if (!z5) {
            View view = alertController.g != null ? alertController.g : alertController.x;
            if (view != null) {
                int i2 = b | (b2 != 0 ? (byte) 2 : (byte) 0);
                Object[] objArr11 = {a3, view, Integer.valueOf(i2), 3};
                ChangeQuickRedirect changeQuickRedirect11 = AlertController.a;
                if (PatchProxy.isSupport(objArr11, alertController, changeQuickRedirect11, false, "a8fd26656497e1f60a47b79613f0bbd1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, alertController, changeQuickRedirect11, false, "a8fd26656497e1f60a47b79613f0bbd1");
                } else {
                    final View findViewById9 = alertController.d.findViewById(R.id.scrollIndicatorUp);
                    final View findViewById10 = alertController.d.findViewById(R.id.scrollIndicatorDown);
                    if (Build.VERSION.SDK_INT >= 23) {
                        ViewCompat.setScrollIndicators(view, i2, 3);
                        if (findViewById9 != null) {
                            a3.removeView(findViewById9);
                        }
                        if (findViewById10 != null) {
                            a3.removeView(findViewById10);
                        }
                    } else {
                        if (findViewById9 != null && (i2 & 1) == 0) {
                            a3.removeView(findViewById9);
                            findViewById9 = null;
                        }
                        if (findViewById10 != null && (i2 & 2) == 0) {
                            a3.removeView(findViewById10);
                            findViewById10 = null;
                        }
                        if (findViewById9 != null || findViewById10 != null) {
                            if (alertController.f != null) {
                                alertController.x.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.meituan.roodesign.widgets.dialog.AlertController.2
                                    public static ChangeQuickRedirect a;

                                    @Override // android.support.v4.widget.NestedScrollView.OnScrollChangeListener
                                    public void onScrollChange(NestedScrollView nestedScrollView, int i3, int i4, int i5, int i6) {
                                        Object[] objArr12 = {nestedScrollView, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                                        ChangeQuickRedirect changeQuickRedirect12 = a;
                                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "c1e5bd9013e49eb8a2cc995a40fe43ea", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "c1e5bd9013e49eb8a2cc995a40fe43ea");
                                        } else {
                                            AlertController.a(nestedScrollView, findViewById9, findViewById10);
                                        }
                                    }
                                });
                                alertController.x.post(new Runnable() { // from class: com.meituan.roodesign.widgets.dialog.AlertController.3
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr12 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect12 = a;
                                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "8c4a2eb197763711726bfad4d9c2676e", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "8c4a2eb197763711726bfad4d9c2676e");
                                        } else {
                                            AlertController.a(alertController.x, findViewById9, findViewById10);
                                        }
                                    }
                                });
                            } else if (alertController.g != null) {
                                alertController.g.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.meituan.roodesign.widgets.dialog.AlertController.4
                                    public static ChangeQuickRedirect a;

                                    @Override // android.widget.AbsListView.OnScrollListener
                                    public final void onScrollStateChanged(AbsListView absListView, int i3) {
                                    }

                                    @Override // android.widget.AbsListView.OnScrollListener
                                    public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
                                        Object[] objArr12 = {absListView, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                                        ChangeQuickRedirect changeQuickRedirect12 = a;
                                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "da24bd2abc663f43272675c35eae0dda", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "da24bd2abc663f43272675c35eae0dda");
                                        } else {
                                            AlertController.a(absListView, findViewById9, findViewById10);
                                        }
                                    }
                                });
                                alertController.g.post(new Runnable() { // from class: com.meituan.roodesign.widgets.dialog.AlertController.5
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr12 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect12 = a;
                                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "fe858fbcec00da150fcab9414c5e74c9", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "fe858fbcec00da150fcab9414c5e74c9");
                                        } else {
                                            AlertController.a(alertController.g, findViewById9, findViewById10);
                                        }
                                    }
                                });
                            } else {
                                if (findViewById9 != null) {
                                    a3.removeView(findViewById9);
                                }
                                if (findViewById10 != null) {
                                    a3.removeView(findViewById10);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView = alertController.g;
        if (listView == null || alertController.E == null) {
            return;
        }
        listView.setAdapter(alertController.E);
        int i3 = alertController.F;
        if (i3 >= 0) {
            listView.setItemChecked(i3, true);
            listView.setSelection(i3);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd0e7411b0f7afd16e8bba3c9cfd2c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd0e7411b0f7afd16e8bba3c9cfd2c5")).booleanValue();
        }
        AlertController alertController = this.b;
        Object[] objArr2 = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = AlertController.a;
        if (PatchProxy.isSupport(objArr2, alertController, changeQuickRedirect2, false, "075f281ed405af19a9d58ee106e393d7", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, alertController, changeQuickRedirect2, false, "075f281ed405af19a9d58ee106e393d7")).booleanValue();
        } else if (alertController.x != null && alertController.x.executeKeyEvent(keyEvent)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab5ca409f31f5c7059a3e710140d2a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab5ca409f31f5c7059a3e710140d2a7")).booleanValue();
        }
        AlertController alertController = this.b;
        Object[] objArr2 = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = AlertController.a;
        if (PatchProxy.isSupport(objArr2, alertController, changeQuickRedirect2, false, "85b9e233e1f908719ead39e340900b72", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, alertController, changeQuickRedirect2, false, "85b9e233e1f908719ead39e340900b72")).booleanValue();
        } else if (alertController.x != null && alertController.x.executeKeyEvent(keyEvent)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final AlertController.a b;
        private final int c;

        public a(@NonNull Context context) {
            this(context, RooAlertDialog.a(context, 0));
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada123939aba951856370b3fd65df799", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada123939aba951856370b3fd65df799");
            }
        }

        private a(@NonNull Context context, @StyleRes int i) {
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0d22c1955ee508b8bc2b52f772e0858", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0d22c1955ee508b8bc2b52f772e0858");
                return;
            }
            this.b = new AlertController.a(new ContextThemeWrapper(context, RooAlertDialog.a(context, i)));
            this.c = i;
        }

        public final a a(@StringRes int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c144c5fa6437526c6a738134a243a4a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c144c5fa6437526c6a738134a243a4a");
            }
            this.b.g = this.b.b.getText(i);
            return this;
        }

        public final a a(@Nullable CharSequence charSequence) {
            this.b.g = charSequence;
            return this;
        }

        public final a b(@StringRes int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81288319faec035f30724a8c53ac6b0d", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81288319faec035f30724a8c53ac6b0d");
            }
            this.b.i = this.b.b.getText(i);
            return this;
        }

        public final a b(@Nullable CharSequence charSequence) {
            this.b.i = charSequence;
            return this;
        }

        public final a a(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "302173e5abbc8e752cf348b1c06d14e5", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "302173e5abbc8e752cf348b1c06d14e5");
            }
            this.b.j = this.b.b.getText(i);
            this.b.k = onClickListener;
            return this;
        }

        public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.b.j = charSequence;
            this.b.k = onClickListener;
            return this;
        }

        public final a b(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {Integer.valueOf(i), onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85afca1ee1b6faa01c6d47149d6f63a9", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85afca1ee1b6faa01c6d47149d6f63a9");
            }
            this.b.l = this.b.b.getText(i);
            this.b.m = onClickListener;
            return this;
        }

        public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.b.l = charSequence;
            this.b.m = onClickListener;
            return this;
        }

        public final a a(boolean z) {
            this.b.p = z;
            return this;
        }

        public final a a(DialogInterface.OnDismissListener onDismissListener) {
            this.b.r = onDismissListener;
            return this;
        }

        public final a a(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe0d0c525e0ba5d389704cc12d1ca05", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe0d0c525e0ba5d389704cc12d1ca05");
            }
            this.b.x = view;
            this.b.w = 0;
            this.b.C = false;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0271  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0206  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.meituan.roodesign.widgets.dialog.RooAlertDialog a() {
            /*
                Method dump skipped, instructions count: 687
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.roodesign.widgets.dialog.RooAlertDialog.a.a():com.meituan.roodesign.widgets.dialog.RooAlertDialog");
        }

        public final RooAlertDialog b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07bca5ab6ea3483b148b94c6a47bb980", RobustBitConfig.DEFAULT_VALUE)) {
                return (RooAlertDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07bca5ab6ea3483b148b94c6a47bb980");
            }
            RooAlertDialog a2 = a();
            a2.show();
            return a2;
        }
    }
}
