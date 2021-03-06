/*
 * Copyright 2012 astamuse company,Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.astamuse.asta4d.snippet;

public class SnippetDeclarationInfo {

    private String snippetName;

    private String snippetHandler;

    private int _hashcode;

    public SnippetDeclarationInfo(String snippetName, String snippetHandler) {
        super();
        this.snippetName = snippetName;
        this.snippetHandler = snippetHandler;

        _hashcode = 0;
        _hashcode += snippetHandler == null ? 0 : snippetHandler.hashCode();
        _hashcode += snippetName == null ? 0 : snippetName.hashCode();

    }

    public String getSnippetName() {
        return snippetName;
    }

    public String getSnippetHandler() {
        return snippetHandler;
    }

    @Override
    public int hashCode() {
        return _hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SnippetDeclarationInfo other = (SnippetDeclarationInfo) obj;
        if (snippetHandler == null) {
            if (other.snippetHandler != null)
                return false;
        } else if (!snippetHandler.equals(other.snippetHandler))
            return false;
        if (snippetName == null) {
            if (other.snippetName != null)
                return false;
        } else if (!snippetName.equals(other.snippetName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("[%s:%s]", snippetName, snippetHandler);
    }

}
