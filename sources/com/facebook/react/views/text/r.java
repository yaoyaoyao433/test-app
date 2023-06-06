package com.facebook.react.views.text;

import java.text.BreakIterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum r {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    public static String a(String str, r rVar) {
        if (str == null) {
            return null;
        }
        switch (rVar) {
            case UPPERCASE:
                return str.toUpperCase();
            case LOWERCASE:
                return str.toLowerCase();
            case CAPITALIZE:
                BreakIterator wordInstance = BreakIterator.getWordInstance();
                wordInstance.setText(str);
                StringBuilder sb = new StringBuilder(str.length());
                int first = wordInstance.first();
                while (true) {
                    int i = first;
                    first = wordInstance.next();
                    if (first != -1) {
                        String substring = str.substring(i, first);
                        if (Character.isLetterOrDigit(substring.charAt(0))) {
                            sb.append(Character.toUpperCase(substring.charAt(0)));
                            sb.append(substring.substring(1).toLowerCase());
                        } else {
                            sb.append(substring);
                        }
                    } else {
                        return sb.toString();
                    }
                }
            default:
                return str;
        }
    }
}
