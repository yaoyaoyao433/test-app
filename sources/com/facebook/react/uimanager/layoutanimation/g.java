package com.facebook.react.uimanager.layoutanimation;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum g {
    CREATE,
    UPDATE,
    DELETE;

    public static String a(g gVar) {
        switch (gVar) {
            case CREATE:
                return "create";
            case UPDATE:
                return "update";
            case DELETE:
                return "delete";
            default:
                throw new IllegalArgumentException("Unsupported LayoutAnimationType: " + gVar);
        }
    }
}
