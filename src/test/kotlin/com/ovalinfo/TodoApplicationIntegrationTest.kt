package com.ovalinfo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc

@SpringBootTest(classes = [SampleApplication::class])
@AutoConfigureMockMvc
@ActiveProfiles("test")
class TodoApplicationIntegrationTest {

    @Autowired
    private lateinit var mvc: MockMvc

}
