/*
 * Copyright (c) 2013-2015 Mozilla Foundation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the 
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL 
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER 
 * DEALINGS IN THE SOFTWARE.
 */

/*
 * THIS IS A GENERATED FILE. PLEASE DO NOT EDIT.
 * Instead, please regenerate using generate-encoding-data.py
 */

package nu.validator.encoding;

import java.nio.charset.CharsetDecoder;

class Windows1258 extends Encoding {

    private static final char[] TABLE = {
        '\u20ac',
        '\u0081',
        '\u201a',
        '\u0192',
        '\u201e',
        '\u2026',
        '\u2020',
        '\u2021',
        '\u02c6',
        '\u2030',
        '\u008a',
        '\u2039',
        '\u0152',
        '\u008d',
        '\u008e',
        '\u008f',
        '\u0090',
        '\u2018',
        '\u2019',
        '\u201c',
        '\u201d',
        '\u2022',
        '\u2013',
        '\u2014',
        '\u02dc',
        '\u2122',
        '\u009a',
        '\u203a',
        '\u0153',
        '\u009d',
        '\u009e',
        '\u0178',
        '\u00a0',
        '\u00a1',
        '\u00a2',
        '\u00a3',
        '\u00a4',
        '\u00a5',
        '\u00a6',
        '\u00a7',
        '\u00a8',
        '\u00a9',
        '\u00aa',
        '\u00ab',
        '\u00ac',
        '\u00ad',
        '\u00ae',
        '\u00af',
        '\u00b0',
        '\u00b1',
        '\u00b2',
        '\u00b3',
        '\u00b4',
        '\u00b5',
        '\u00b6',
        '\u00b7',
        '\u00b8',
        '\u00b9',
        '\u00ba',
        '\u00bb',
        '\u00bc',
        '\u00bd',
        '\u00be',
        '\u00bf',
        '\u00c0',
        '\u00c1',
        '\u00c2',
        '\u0102',
        '\u00c4',
        '\u00c5',
        '\u00c6',
        '\u00c7',
        '\u00c8',
        '\u00c9',
        '\u00ca',
        '\u00cb',
        '\u0300',
        '\u00cd',
        '\u00ce',
        '\u00cf',
        '\u0110',
        '\u00d1',
        '\u0309',
        '\u00d3',
        '\u00d4',
        '\u01a0',
        '\u00d6',
        '\u00d7',
        '\u00d8',
        '\u00d9',
        '\u00da',
        '\u00db',
        '\u00dc',
        '\u01af',
        '\u0303',
        '\u00df',
        '\u00e0',
        '\u00e1',
        '\u00e2',
        '\u0103',
        '\u00e4',
        '\u00e5',
        '\u00e6',
        '\u00e7',
        '\u00e8',
        '\u00e9',
        '\u00ea',
        '\u00eb',
        '\u0301',
        '\u00ed',
        '\u00ee',
        '\u00ef',
        '\u0111',
        '\u00f1',
        '\u0323',
        '\u00f3',
        '\u00f4',
        '\u01a1',
        '\u00f6',
        '\u00f7',
        '\u00f8',
        '\u00f9',
        '\u00fa',
        '\u00fb',
        '\u00fc',
        '\u01b0',
        '\u20ab',
        '\u00ff'
    };
    
    private static final String[] LABELS = {
        "cp1258",
        "windows-1258",
        "x-cp1258"
    };
    
    private static final String NAME = "windows-1258";
    
    static final Encoding INSTANCE = new Windows1258();
    
    private Windows1258() {
        super(NAME, LABELS);
    }

    @Override public CharsetDecoder newDecoder() {
        return new InfallibleSingleByteDecoder(this, TABLE);
    }

}
