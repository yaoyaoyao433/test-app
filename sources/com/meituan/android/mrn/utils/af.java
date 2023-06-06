package com.meituan.android.mrn.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class af {
    public static ChangeQuickRedirect a;
    private static final int b = Color.parseColor("#00000000");

    @TargetApi(19)
    public static void a(Activity activity, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        Object[] objArr = {activity, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "142b3705299a544b55b2951dd737fef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "142b3705299a544b55b2951dd737fef7");
            return;
        }
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            ViewCompat.setFitsSystemWindows(childAt, false);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            int a2 = ak.a((Context) activity);
            window.addFlags(67108864);
            if (Build.VERSION.SDK_INT >= 21) {
                Object[] objArr2 = {(byte) 1, window, childAt};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "78b28311a099e1f2b4c1395e5e59e4e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "78b28311a099e1f2b4c1395e5e59e4e2");
                } else {
                    window.addFlags(Integer.MIN_VALUE);
                    window.clearFlags(67108864);
                    window.setStatusBarColor(b);
                    if (childAt != null) {
                        ViewCompat.requestApplyInsets(childAt);
                    }
                }
            } else {
                ViewGroup viewGroup2 = (ViewGroup) window.getDecorView();
                if (viewGroup2.getTag() != null && (viewGroup2.getTag() instanceof Boolean) && ((Boolean) viewGroup2.getTag()).booleanValue()) {
                    viewGroup.removeView(viewGroup2.getChildAt(0));
                    View childAt2 = viewGroup.getChildAt(0);
                    if (childAt2 != null && (layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams()) != null && layoutParams.topMargin >= a2) {
                        layoutParams.topMargin -= a2;
                        childAt2.setLayoutParams(layoutParams);
                    }
                    viewGroup2.setTag(Boolean.FALSE);
                }
            }
        } else {
            int color = activity.getResources().getColor(R.color.mrn_black);
            Object[] objArr3 = {activity, Integer.valueOf(color)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "691ccb4f4312ede32438714aff9f174b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "691ccb4f4312ede32438714aff9f174b");
            } else {
                Window window2 = activity.getWindow();
                ViewGroup viewGroup3 = (ViewGroup) activity.findViewById(16908290);
                if (Build.VERSION.SDK_INT >= 19) {
                    window2.addFlags(67108864);
                    if (Build.VERSION.SDK_INT >= 21) {
                        Object[] objArr4 = {Integer.valueOf(color), window2, viewGroup3};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "aca9182114a224167967883f15740120", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "aca9182114a224167967883f15740120");
                        } else {
                            window2.clearFlags(67108864);
                            window2.addFlags(Integer.MIN_VALUE);
                            window2.setStatusBarColor(color);
                            View childAt3 = viewGroup3.getChildAt(0);
                            if (childAt3 != null) {
                                ViewCompat.setFitsSystemWindows(childAt3, true);
                            }
                        }
                    } else {
                        ViewGroup viewGroup4 = (ViewGroup) window2.getDecorView();
                        if (viewGroup4.getTag() != null && (viewGroup4.getTag() instanceof Boolean) && ((Boolean) viewGroup4.getTag()).booleanValue()) {
                            View childAt4 = viewGroup4.getChildAt(0);
                            if (childAt4 != null) {
                                childAt4.setBackgroundColor(color);
                            }
                        } else {
                            int a3 = ak.a((Context) activity);
                            View childAt5 = viewGroup3.getChildAt(0);
                            if (childAt5 != null) {
                                ViewCompat.setFitsSystemWindows(childAt5, false);
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt5.getLayoutParams();
                                layoutParams2.topMargin += a3;
                                childAt5.setLayoutParams(layoutParams2);
                            }
                            View view = new View(activity);
                            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, a3);
                            layoutParams3.gravity = 48;
                            view.setLayoutParams(layoutParams3);
                            view.setBackgroundColor(color);
                            viewGroup4.addView(view, 0);
                            viewGroup4.setTag(Boolean.TRUE);
                        }
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(8192);
        }
    }
}
