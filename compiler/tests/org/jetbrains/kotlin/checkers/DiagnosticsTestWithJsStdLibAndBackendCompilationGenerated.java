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

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticsTestWithJsStdLibAndBackendCompilationGenerated extends AbstractDiagnosticsTestWithJsStdLibAndBackendCompilation {
    public void testAllFilesPresentInTestsWithJsStdLibAndBackendCompilation() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Inline extends AbstractDiagnosticsTestWithJsStdLibAndBackendCompilation {
        public void testAllFilesPresentInInline() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("recursionCycle.kt")
        public void testRecursionCycle() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycle.kt");
            doTest(fileName);
        }

        @TestMetadata("recursionCycleLambda.kt")
        public void testRecursionCycleLambda() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycleLambda.kt");
            doTest(fileName);
        }

        @TestMetadata("recursionCycleWithPublicFun.kt")
        public void testRecursionCycleWithPublicFun() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycleWithPublicFun.kt");
            doTest(fileName);
        }

        @TestMetadata("recursionCycleWithStdlibCall.kt")
        public void testRecursionCycleWithStdlibCall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJsStdLibAndBackendCompilation/inline/recursionCycleWithStdlibCall.kt");
            doTest(fileName);
        }
    }
}
