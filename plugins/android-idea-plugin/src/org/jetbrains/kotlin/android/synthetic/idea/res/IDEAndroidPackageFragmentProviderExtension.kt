/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.android.synthetic.idea.res

import com.intellij.openapi.module.ModuleServiceManager
import com.intellij.openapi.project.Project
import org.jetbrains.android.facet.AndroidFacet
import org.jetbrains.kotlin.analyzer.ModuleInfo
import org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager
import org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension
import org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceInfo

class IDEAndroidPackageFragmentProviderExtension : AndroidPackageFragmentProviderExtension() {

    override fun getLayoutXmlFileManager(project: Project, moduleInfo: ModuleInfo?): AndroidLayoutXmlFileManager? {
        val moduleSourceInfo = moduleInfo as? ModuleSourceInfo ?: return null
        val module = moduleSourceInfo.module
        if (AndroidFacet.getInstance(module) == null) return null
        return ModuleServiceManager.getService(module, AndroidLayoutXmlFileManager::class.java)
    }
}