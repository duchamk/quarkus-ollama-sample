/*
 * Copyright 2024 <a href="mailto:albert.kubicki@wp.pl">Albert Michał Kubicki</a>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package prv.duchamk.test.ollama.client;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import io.quarkiverse.langchain4j.RegisterAiService;

/**
 *
 * @author <a href="mailto:albert.kubicki@wp.pl">Albert Michał Kubicki</a>
 */
@RegisterAiService
public interface OllamaAi {
    
    @SystemMessage("Answer concisely.")
    @UserMessage("{{question}}")
    String answerQuestion(@V("question") String question);
}
