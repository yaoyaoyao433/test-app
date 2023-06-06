package com.facebook.react.uimanager.events;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum h {
    START,
    END,
    MOVE,
    CANCEL;

    public static String a(h hVar) {
        switch (hVar) {
            case START:
                return "topTouchStart";
            case END:
                return "topTouchEnd";
            case MOVE:
                return "topTouchMove";
            case CANCEL:
                return "topTouchCancel";
            default:
                throw new IllegalArgumentException("Unexpected type " + hVar);
        }
    }
}
